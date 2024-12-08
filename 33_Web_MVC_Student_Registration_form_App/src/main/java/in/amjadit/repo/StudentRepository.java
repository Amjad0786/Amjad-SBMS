package in.amjadit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.amjadit.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
