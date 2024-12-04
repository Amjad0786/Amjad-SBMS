package in.amjadit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.amjadit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("Delete from student where id = :sid")

	public void deleteEmployee(Integer sid);
}
