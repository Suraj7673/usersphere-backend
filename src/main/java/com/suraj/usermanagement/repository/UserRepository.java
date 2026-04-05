package com.suraj.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.suraj.usermanagement.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}