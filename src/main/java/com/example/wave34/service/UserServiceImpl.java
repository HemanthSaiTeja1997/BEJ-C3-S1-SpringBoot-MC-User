/*
 *Author Name :P.Hemanth Sai Teja
 *Date:29-11-2022
 *Created With: IntelliJ IDEA Community Edition
 */

package com.example.wave34.service;

import com.example.wave34.domain.User;
import com.example.wave34.exception.UserNotFoundException;
import com.example.wave34.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }


    @Override
    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User getUserByUsernameAndPassword(String username, String password) throws UserNotFoundException {
        User userObj = userRepository.findByUsernameAndPassword(username, password);
        if (userObj == null) {
            throw new UserNotFoundException();
        }
        return userObj;
    }
}
