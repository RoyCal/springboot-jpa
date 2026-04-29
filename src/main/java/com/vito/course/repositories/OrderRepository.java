package com.vito.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vito.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
