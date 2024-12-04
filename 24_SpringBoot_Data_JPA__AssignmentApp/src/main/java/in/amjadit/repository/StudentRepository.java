package in.amjadit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.amjadit.entity.Student;
import jakarta.transaction.Transactional;

public interface StudentRepository  extends JpaRepository<Student, Integer>{

	/*
	 * @Query("delete from Student where id = :sid")
	 * 
	 * @Modifying
	 * 
	 * @Transactional 
	 * public void deleteStudent(Integer sid);
	 */
	/*
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query("update Student set gender = :gender where id = id") public void
	 * updateStudent(Integer sid , String gender);
	 */
	
	@Transactional
	@Modifying
	@Query(value="insert into stu_tbls(int_id, str_name, s_gender)values(:id, :name, :gender)", nativeQuery = true)
	public void insertStudent(Integer id , String name, String gender);
	
}
