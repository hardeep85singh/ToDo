package com.example.ToDo.service;

import com.example.ToDo.model.User;

import java.util.List;

public interface UserService {

    public void createUser(User user);

    public List<User> getAllUsers();

}
