package abuzarov.samorezik.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;

import abuzarov.samorezik.model.Product;

public interface ProductService {
	public Product save(Product product);

	Optional<Product> findById(Long id);

	Iterable<Product> findAll();

	void deleteById(Long id);

}
