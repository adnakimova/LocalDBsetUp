package mvc.localDBsetUp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import mvc.localDBsetUp.entities.Product;


@Service
public interface ProductService {
	
	List<Product> getAll();
	void add(Product product);	
	Optional<Product> getByProductId(int id);
	void delete(int id);
	void update(Product product);
	
	
}
