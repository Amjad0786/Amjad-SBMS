package in.amjadit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.amjadit.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {

}
