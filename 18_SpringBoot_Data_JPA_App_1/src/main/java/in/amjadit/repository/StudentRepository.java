package in.amjadit.repository;

import org.springframework.data.repository.CrudRepository;

import in.amjadit.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
