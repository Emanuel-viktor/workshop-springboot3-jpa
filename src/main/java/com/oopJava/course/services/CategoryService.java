package com.oopJava.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oopJava.course.entities.Category;
import com.oopJava.course.repositories.CategoryRepository;


@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> finaAll() {
		return repository.findAll();

	}
public Category findBYId(Long id) {
	Optional <Category> obj = repository.findById(id);
	return obj.get();
}
}
