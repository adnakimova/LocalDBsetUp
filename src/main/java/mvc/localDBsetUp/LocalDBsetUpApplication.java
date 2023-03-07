package mvc.localDBsetUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mvc.localDBsetUp.entities.Product;
import mvc.localDBsetUp.services.ProductService;


@SpringBootApplication
public class LocalDBsetUpApplication{

	public static void main(String[] args) {
		SpringApplication.run(LocalDBsetUpApplication.class, args);
		
		System.out.println("----Run----");
		
	}
	

}
