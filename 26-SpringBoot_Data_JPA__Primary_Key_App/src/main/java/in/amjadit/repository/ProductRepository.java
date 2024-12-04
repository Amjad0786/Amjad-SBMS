package in.amjadit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.amjadit.entity.Product;

public interface ProductRepository extends JpaRepository<Product , Integer>{

}
