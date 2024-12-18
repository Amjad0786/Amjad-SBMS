package in.amjadit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.amjadit.entity.Product;
import in.amjadit.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		ProductRepository bean = run.getBean(ProductRepository.class);
		
		Product p = new Product();
		
		p.setProductName("Mouse");
		p.setProductPrice(180.00);
		bean.save(p);
		System.out.println("Record is Inserted... ");
	}

}
