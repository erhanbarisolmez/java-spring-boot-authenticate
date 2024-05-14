package com.security.jwttoken.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.jwttoken.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findfindByUsername(String userName);
  
}