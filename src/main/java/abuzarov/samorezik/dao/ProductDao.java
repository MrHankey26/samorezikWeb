package abuzarov.samorezik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import abuzarov.samorezik.model.Product;

public interface ProductDao extends JpaRepository<Product, Long> {

}
