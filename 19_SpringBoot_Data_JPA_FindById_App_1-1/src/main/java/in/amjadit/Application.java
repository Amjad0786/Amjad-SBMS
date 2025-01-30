package in.amjadit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.amjadit.entity.Customer;
import in.amjadit.repository.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		CustomerRepository repository = context.getBean(CustomerRepository.class);

		Optional<Customer> optional = repository.findById(201);
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		

		
	}

}
