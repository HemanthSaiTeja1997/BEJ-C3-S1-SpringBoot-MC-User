package com.example.wave34.service;

import com.example.wave34.domain.User;

import java.util.Map;

public interface SecurityTokenGenerator {
    Map<String, String> generateToken(User user);
}
