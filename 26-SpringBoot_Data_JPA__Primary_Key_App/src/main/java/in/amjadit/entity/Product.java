package in.amjadit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Prod_tabls")

public class Product {

	@Id
	@Column(name = "int_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer productId;

	@Column(name = "str_name")
	private String productName;

	@Column(name = "dou_price")
	private Double productPrice;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, double productPrice) {

		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}
