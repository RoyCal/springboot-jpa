package com.vito.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vito.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
