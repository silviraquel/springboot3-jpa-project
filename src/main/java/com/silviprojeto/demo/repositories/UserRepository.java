package com.silviprojeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silviprojeto.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
