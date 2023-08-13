package com.example.scheduling.user.repository;

import com.example.scheduling.user.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsUserByName(String userName);
    Optional<User> findByName(String userName);
}
