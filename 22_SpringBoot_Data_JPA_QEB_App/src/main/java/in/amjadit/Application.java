package in.amjadit;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import in.amjadit.entity.Student;
import in.amjadit.repo.StudentRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        StudentRepository bean = context.getBean(StudentRepository.class);

        Student s1 = new Student();
        s1.setGender("Male");
        s1.setRank(07);

        Example<Student> example = Example.of(s1);

        // Change from Iterable to List
        List<Student> all = bean.findAll(example);

        // Print students for verification
        all.forEach(System.out::println);
    }
}

