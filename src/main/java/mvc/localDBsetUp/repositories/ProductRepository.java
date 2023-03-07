package mvc.localDBsetUp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mvc.localDBsetUp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
