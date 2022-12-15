package com.projetonosso.projetonosso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetonosso.projetonosso.entities.Category;
import com.projetonosso.projetonosso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
