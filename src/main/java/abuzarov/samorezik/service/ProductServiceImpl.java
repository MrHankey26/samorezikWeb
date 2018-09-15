package abuzarov.samorezik.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import abuzarov.samorezik.dao.ProductDao;
import abuzarov.samorezik.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;

	@Override
	public Product save(Product product) {

		return productDao.save(product);
	}

	@Override
	public Optional<Product> findById(Long id) {
		return productDao.findById(id);
	}

	@Override
	public Iterable<Product> findAll() {
		
		return productDao.findAll();
	}

	@Override
	public void deleteById(Long id) {
		productDao.deleteById(id);
		
	}



}
