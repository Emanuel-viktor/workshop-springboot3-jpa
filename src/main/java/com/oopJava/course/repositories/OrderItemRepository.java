package com.oopJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oopJava.course.entities.OrderItem;
import com.oopJava.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>  {

}
