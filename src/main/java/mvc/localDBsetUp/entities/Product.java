package mvc.localDBsetUp.entities;
import javax.persistence.*;


@Table(name = "products")
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	private String productName;
	private long categoryId;
	private double unitPrice;
	private String description;
	
	public Product() {}
	
	public Product(long productId, String productName, long categoryId, double unitPrice, String description) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.categoryId = categoryId;
		this.unitPrice = unitPrice;
		this.description = description;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
