package in.amjadit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.amjadit.entity.Student;
import in.amjadit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository repository = context.getBean(StudentRepository.class);
		
		/* repository.deleteStudent(05); */
		
//		repository.updateStudent(4, "male");
		
		repository.insertStudent(5, "Raju", "Male");
		
		System.out.println("Records Inserted....");
	}

}
