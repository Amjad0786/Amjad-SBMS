package in.amjad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.amjadit.entity.PassportPerson;

public interface PassportPersonRepository extends JpaRepository<PassportPerson, Integer> {

}
