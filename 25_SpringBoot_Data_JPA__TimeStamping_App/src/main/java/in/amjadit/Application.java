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

		/*
		 * Employee e = new Employee(01, "Amjad", 101, "Male", "Y"); Employee e1 = new
		 * Employee(02, "Sameer", 102, "Male", "N"); Employee e2 = new Employee(03,
		 * "Tafseer", 103, "Male", "Y");
		 * 
		 * List<Employee> asList = Arrays.asList(e, e1, e2); repository.saveAll(asList);
		 * System.out.println("Record Succesfully Inserted....");
		 */

		Employee employee = repository.findById(2).get();
		employee.setActiveSW("Y");
		repository.save(employee);

	}

}
