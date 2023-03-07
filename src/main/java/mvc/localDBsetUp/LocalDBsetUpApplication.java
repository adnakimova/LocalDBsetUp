package mvc.localDBsetUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mvc.localDBsetUp.entities.Category;
import mvc.localDBsetUp.services.CategoryService;



@SpringBootApplication
public class LocalDBsetUpApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(LocalDBsetUpApplication.class, args);
		
		System.out.println("----Run----");
		
	}
	@Autowired
	private CategoryService categoryService;

	@Override
	public void run(String... args) throws Exception {
//		Category category  = new Category();
//		category.setCategoryName("Food");
//		this.categoryService.addCategory(category);
	}
	

}
