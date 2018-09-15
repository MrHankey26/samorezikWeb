package abuzarov.samorezik.controll;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.core.io.ClassPathResource;

import abuzarov.samorezik.model.Product;

public class Parser {
	public static ArrayList<Product> parse(String name) {
		String secondCell = null;
		ArrayList<Product> products = new ArrayList<>();
		Product product = new Product();
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
		labelRow: while (it.hasNext()) {
			Row row = it.next();
			Iterator<Cell> cells = row.iterator();
			while (cells.hasNext()) {
				Cell cell = cells.next();

				if (row.getRowNum() > 13) {

					int cellType = cell.getCellType();
					switch (cellType) {

					case Cell.CELL_TYPE_STRING:
						if (cell.getStringCellValue().matches(".*[0-9]")) {
							result += cell.getStringCellValue();
							String[] results = result.split(", ");
							product.setNameProduct(results[0]);
							if (results.length > 2) {
								
								for (String string : results) {
									secondCell+=string;
								}
							}
							
							product.setCount(secondCell);
							products.add(product);
							break;
						} else {
							continue labelRow;
						}
			/*		case Cell.CELL_TYPE_NUMERIC:
						

						result += cell.getNumericCellValue();
						product.setPrice(Float.parseFloat(result));
                        products.add(product);
						break;
					default:
						result += "|";
						break;*/
					}
				}
			}
		}
		return products;
	}

}
