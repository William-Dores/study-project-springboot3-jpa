package com.treinandospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinandospring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
	

}
