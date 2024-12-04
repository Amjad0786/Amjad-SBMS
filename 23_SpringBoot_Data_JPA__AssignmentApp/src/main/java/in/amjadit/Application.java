package in.amjadit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.amjadit.entity.Employee;
import in.amjadit.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		
		// Insert , Update, & Delete, records using custom Queries in Data JPA
		
		/* repository.deleteById(4) */;
		
		//repository.getById(2);
		
		
		
		
		
		}

}



