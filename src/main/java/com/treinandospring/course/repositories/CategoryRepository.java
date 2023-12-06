package com.treinandospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinandospring.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
