package in.amjadit;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.amjadit.entity.Students;
import in.amjadit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepository repository = context.getBean(StudentRepository.class);

		

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name --> ");
		String gender = s.next();
		
		// pagination--> Perform
	
		/*
		 * PageRequest page = PageRequest.of(pageNo, pageSize); Page<Students> student =
		 * repository.findAll(page); List<Students> list = student.getContent();
		 * list.forEach(System.out::println);
		 */

		//Sorting--> Perform
		/*
		 * List<Students> students = repository.findAll(Sort.by("gender"));
		 * students.forEach(System.out::println);
		 */
		
		/*
		 * List<Students> students = repository.findAll(Sort.by("name"));
		 * students.forEach(System.out::println);
		 * 
		 */
		
		/*
		 * List<Students> students = repository.findAll(Sort.by("name").descending());
		 * students.forEach(System.out::println);
		 */
		
		
		 
	}

}
