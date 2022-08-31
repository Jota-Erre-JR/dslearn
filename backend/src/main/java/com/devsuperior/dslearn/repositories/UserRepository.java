package com.devsuperior.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearn.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
