package com.oopJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oopJava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
