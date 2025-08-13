package com.oopJava.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oopJava.course.entities.Product;
import com.oopJava.course.repositories.ProductRepository;


@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> finaAll() {
		return repository.findAll();

	}
public Product findBYId(Long id) {
	Optional <Product> obj = repository.findById(id);
	return obj.get();
}
}
