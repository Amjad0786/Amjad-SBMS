package in.amjadit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.amjadit.Entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	/*
	 * public List<Employee> findByGender(String gender);
	 */
	/* public List<Employee> findByRankGreaterThenEqual(Long rank); */
	
	/* public List<Employee> findByRankLessThenEqual(Long rank); */
	
	public List<Employee> findByRankAndByGender(long rank, String gender);

}
