package mvc.localDBsetUp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mvc.localDBsetUp.entities.Product;
import mvc.localDBsetUp.services.ProductService;


@RestController
@RequestMapping(value = "/api/products")
public class ProductController {
	
	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getAll")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Product product) {
		 this.productService.add(product);
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getByProductId(@PathVariable int id){
		return this.productService.getByProductId(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.productService.delete(id);
	}
	

}
 