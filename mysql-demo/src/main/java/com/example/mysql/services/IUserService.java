package com.example.mysql.services;

import com.example.mysql.models.UserDTO;

import java.util.List;

public interface IUserService {
    public List<UserDTO> getAllUsers();
}
