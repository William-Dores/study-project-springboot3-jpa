package com.treinandospring.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.treinandospring.course.entities.Order;
import com.treinandospring.course.entities.User;
import com.treinandospring.course.repositories.OrderRepository;
import com.treinandospring.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Teste 1111", "teste1@gmail.com", "111111111", "111111");
		User u2 = new User(null, "Teste 2222 ", "teste2@gmail.com", "2222222222", "222222");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-06-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-06-20T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
	
	

}
