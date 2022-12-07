package com.projetonosso.projetonosso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetonosso.projetonosso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
