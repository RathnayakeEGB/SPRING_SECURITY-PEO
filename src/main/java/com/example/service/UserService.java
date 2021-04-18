package com.example.service;

import com.example.entities.User;
import com.example.models.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
