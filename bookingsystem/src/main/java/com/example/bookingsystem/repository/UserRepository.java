package com.example.bookingsystem.repository;

import com.example.bookingsystem.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
