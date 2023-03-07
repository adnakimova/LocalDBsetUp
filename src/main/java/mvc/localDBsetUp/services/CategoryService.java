package mvc.localDBsetUp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.localDBsetUp.entities.Category;
import mvc.localDBsetUp.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public void addCategory(Category category) {
		this.categoryRepository.save(category);
	}
	public List<Category> getAllCategory() {
		return this.categoryRepository.findAll();
	}
}
