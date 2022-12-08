package com.projetonosso.projetonosso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetonosso.projetonosso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
