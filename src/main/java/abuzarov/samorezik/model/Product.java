package abuzarov.samorezik.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nameProduct;
	private String count;
	private float price;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" ");
		builder.append(id);
		builder.append(" ");
		builder.append(nameProduct);
		builder.append(" ");
		builder.append(count);
		builder.append(" ");
		builder.append(price);
		builder.append(" ");
		return builder.toString();
	}
	


}
