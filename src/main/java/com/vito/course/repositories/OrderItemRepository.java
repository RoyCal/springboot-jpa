package com.vito.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vito.course.entities.OrderItem;
import com.vito.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
