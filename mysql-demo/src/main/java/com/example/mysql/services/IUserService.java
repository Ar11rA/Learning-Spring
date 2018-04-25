package com.example.mysql.services;

import com.example.mysql.domains.User;

import java.util.List;

public interface IUserService {
    public List<User> getUsers();
}
