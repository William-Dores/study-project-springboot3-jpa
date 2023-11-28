package com.treinandospring.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.treinandospring.course.entities.User;
import com.treinandospring.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Teste 1111", "teste1@gmail.com", "111111111", "111111");
		User u2 = new User(null, "Teste 2222 ", "teste2@gmail.com", "2222222222", "222222");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	

}
