package mvc.localDBsetUp.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import mvc.localDBsetUp.entities.Product;
import mvc.localDBsetUp.repositories.ProductRepository;

@Component
public class ProductManager implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	

	
	@Override
	public List<Product> getAll() {
		return this.productRepository.findAll();
	}

	@Override
	public void add(Product product) {
		this.productRepository.save(product);
	}

	@Override
	public Optional<Product> getByProductId(int id) {
		return this.productRepository.findById(id);
	}

	@Override
	public void delete(int id) {
		this.productRepository.deleteById(id);
		
	}

	

}