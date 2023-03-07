package mvc.localDBsetUp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mvc.localDBsetUp.entities.Category;
import mvc.localDBsetUp.services.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/add")
	public void addCategory(Category category) {
		this.categoryService.addCategory(category);
	}
	
	@GetMapping("/getAll")
	public List<Category> getAll(){
		return this.categoryService.getAllCategory();
	}
}
