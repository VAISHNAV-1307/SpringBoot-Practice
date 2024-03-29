package com.example.ssm_e2.repositories;

import com.example.ssm_e2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

//    @Query("""
//            SELECT u FROM USER u WHERE u.username =:username
//            """)
    Optional<User> findByUsername(String username);
}
