package com.vito.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vito.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
