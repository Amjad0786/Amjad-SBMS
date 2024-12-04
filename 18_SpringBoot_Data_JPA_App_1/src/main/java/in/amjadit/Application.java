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

		StudentRepository studentsrepo = context.getBean(StudentRepository.class);

		Student s = new Student();

		s.setId(104);
		s.setName("Azam");
		s.setRank(9601);
		s.setGender("Male");

		studentsrepo.save(s);
		System.out.println("Record Inserted...");

	}

}
