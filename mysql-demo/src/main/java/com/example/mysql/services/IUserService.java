package com.example.mysql.services;

import com.example.mysql.models.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long id);
    UserDTO createNewUser(UserDTO userDTO);
    UserDTO updateUserById(Long id, UserDTO userDTO);
    void deleteUserById(Long id);
}
