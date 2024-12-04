package in.amjad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.amjadit.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

	

}
