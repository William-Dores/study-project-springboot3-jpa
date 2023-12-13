package com.treinandospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinandospring.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
