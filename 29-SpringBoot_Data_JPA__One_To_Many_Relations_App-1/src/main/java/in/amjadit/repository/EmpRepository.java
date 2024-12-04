package in.amjadit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.amjadit.Entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
