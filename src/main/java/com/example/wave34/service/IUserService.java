package com.example.wave34.service;

import com.example.wave34.domain.User;
import com.example.wave34.exception.UserNotFoundException;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    List<User> getAllUser();

    Optional<User> getUserById(int id);

    User getUserByUsernameAndPassword(String username, String password) throws UserNotFoundException;

    boolean deleteUserById(int uid);


}
