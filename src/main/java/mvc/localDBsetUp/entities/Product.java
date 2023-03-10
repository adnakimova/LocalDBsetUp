package mvc.localDBsetUp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;


@Entity
@Table(name="products")
@Data
public class Product implements BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	
//	@Column(name="category_id")
//	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	
	@Column(name="unit_price")
	private double unitPrice;
	
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	
	@Column(name="quantity_per_unit")
	private String quentityPerUnit;
	
	@ManyToOne()
	@JoinColumn(name="category_id")
	private Category category;
	
}