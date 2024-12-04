package in.amjadit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.amjadit.Entity.Product;
import in.amjadit.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepository repository = context.getBean(ProductRepository.class);
		
		List<Product> products = repository.getAllProducts();
		
		products.forEach(System.out::println);
	}

}
