package com.skycorp.simrs.repository;

import com.skycorp.simrs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByUsername(String username);

  User findById(String id);
}
