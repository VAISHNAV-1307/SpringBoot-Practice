package com.vaishnav.userservice.repository;

import com.vaishnav.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
