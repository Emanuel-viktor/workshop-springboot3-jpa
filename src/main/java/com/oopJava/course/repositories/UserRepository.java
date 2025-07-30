package com.oopJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oopJava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
