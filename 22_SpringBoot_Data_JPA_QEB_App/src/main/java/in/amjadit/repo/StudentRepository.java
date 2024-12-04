package in.amjadit.repo;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.repository.CrudRepository;

import in.amjadit.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{

	List<Student> findAll(Example<Student> example);

}
