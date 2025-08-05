package com.oopJava.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oopJava.course.entities.Order;
import com.oopJava.course.repositories.OrderRepository;


@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> finaAll() {
		return repository.findAll();

	}

	public Order findBYId(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
