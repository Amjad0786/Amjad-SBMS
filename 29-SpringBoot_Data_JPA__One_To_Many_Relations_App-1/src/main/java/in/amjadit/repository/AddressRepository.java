package in.amjadit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.amjadit.Entity.Address;

public interface AddressRepository  extends JpaRepository<Address, Integer>{

}
