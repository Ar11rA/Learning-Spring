package com.example.mysql.services;

import com.example.mysql.domains.User;
import com.example.mysql.mappers.UserMapper;
import com.example.mysql.models.UserDTO;
import com.example.mysql.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> getAllUsers() {
       return userRepository.findAll()
                .stream()
                .map(userMapper::userToUserDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(Long id) {
        return userRepository.findById(id)
                .map(userMapper::userToUserDTO)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public UserDTO createNewUser(UserDTO userDTO) {
       User user = userMapper.userDtoToUser((userDTO));
       User savedUser = userRepository.save(user);
       UserDTO savedUserDTO = userMapper.userToUserDTO((savedUser));
       return savedUserDTO;
    }


}
