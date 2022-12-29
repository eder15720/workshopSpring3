package com.projetonosso.projetonosso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetonosso.projetonosso.entities.Category;
import com.projetonosso.projetonosso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
