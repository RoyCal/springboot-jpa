package com.vito.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vito.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
