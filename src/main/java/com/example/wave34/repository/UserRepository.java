package com.example.wave34.repository;

import com.example.wave34.domain.User;
import com.example.wave34.exception.UserNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsernameAndPassword(String username, String password) throws UserNotFoundException;
}
