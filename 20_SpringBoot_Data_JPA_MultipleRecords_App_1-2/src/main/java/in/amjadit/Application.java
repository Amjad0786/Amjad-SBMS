package in.amjadit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.amjadit.Entity.Employee;
import in.amjadit.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeRepository repository = context.getBean(EmployeeRepository.class);

		/*
		 * List<Employee> byGender = repository.findByGender("Male");
		 * byGender.forEach(System.out::println);
		 */
		
		/*
		 * List<Employee> byRankGreaterThenEqual =
		 * repository.findByRankGreaterThenEqual(100l);
		 * byRankGreaterThenEqual.forEach(System.ofuut::println);
		 */
		
		
		List<Employee> byRankAndByGender = repository.findByRankAndByGender(100, "male");
		byRankAndByGender.forEach(System.out::println);
	}
}
