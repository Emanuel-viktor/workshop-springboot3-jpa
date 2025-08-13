package com.oopJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oopJava.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
