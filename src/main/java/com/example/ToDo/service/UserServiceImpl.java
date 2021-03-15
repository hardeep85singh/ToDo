package com.example.ToDo.service;

import com.example.ToDo.model.User;
import com.example.ToDo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired //UserRepository is injected
    private UserRepository userRepository;

    @Override
    public void createUser(User user) {
        userRepository.save(new User(user.getFirstName(), user.getLastName()));
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
}
