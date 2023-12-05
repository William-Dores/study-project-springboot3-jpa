package com.treinandospring.course.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.treinandospring.course.entities.Order;
import com.treinandospring.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		 Optional<Order> obj = repository.findById(id);
		 return obj.get();
	}
}
