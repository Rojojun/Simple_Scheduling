package com.example.scheduling.user.repository;

import com.example.scheduling.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
