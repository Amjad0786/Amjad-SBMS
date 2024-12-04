package in.amjadit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.amjadit.entity.Students;

public interface StudentRepository extends JpaRepository<Students, Integer> {

}
