package com.projetonosso.projetonosso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetonosso.projetonosso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
