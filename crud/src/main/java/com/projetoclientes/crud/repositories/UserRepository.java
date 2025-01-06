package com.projetoclientes.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoclientes.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

	
}
