package com.example.mysql.services;

import com.example.mysql.domains.User;
import com.example.mysql.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }
}
