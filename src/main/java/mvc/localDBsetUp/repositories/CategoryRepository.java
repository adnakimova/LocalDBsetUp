package mvc.localDBsetUp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mvc.localDBsetUp.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
