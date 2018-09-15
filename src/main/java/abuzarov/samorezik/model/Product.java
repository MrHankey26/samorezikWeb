package abuzarov.samorezik.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Lob
	private String nameProduct;
	//private double price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
/*	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" ");
		builder.append(id);
		builder.append(" ");
		builder.append(nameProduct);
		builder.append(" ");
	//	builder.append(price);
		builder.append(" ");
		return builder.toString();
	}

}
