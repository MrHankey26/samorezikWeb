package abuzarov.samorezik.controll;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.core.io.ClassPathResource;

public class Parser {
	public static String parse(String name) {
		String result = "";
		InputStream in = null;
		HSSFWorkbook wb = null;
		try {
			File file = new ClassPathResource(name).getFile();
			in = new FileInputStream(file);
			wb = new HSSFWorkbook(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = wb.getSheetAt(0);
		Iterator<Row> it = sheet.iterator();
	labelRow:	while (it.hasNext()) {
			Row row = it.next();
			Iterator<Cell> cells = row.iterator();
		labelCell:	while (cells.hasNext()) {
				Cell cell = cells.next();
				int cellType;
				if (row.getRowNum() > 14) {

					cellType = cell.getCellType();
					switch (cellType) {
					case Cell.CELL_TYPE_STRING:
						if (!cell.getStringCellValue().endsWith(", ")) {
							result += cell.getStringCellValue();
							break;
						} else { 
							continue labelRow;
						}
						
					case Cell.CELL_TYPE_NUMERIC:

						result += cell.getNumericCellValue();

						break;
					default:
						result += "|";
						break;
					}
				}
				result += "\n";
			}
		}
		return result;
	}

}
