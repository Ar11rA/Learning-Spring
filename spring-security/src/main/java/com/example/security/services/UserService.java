package com.example.security.services;

import com.example.security.DTOs.RegisterDTO;
import com.example.security.domains.Auth;
import com.example.security.domains.User;
import com.example.security.repositories.AuthRepository;
import com.example.security.repositories.UserRepository;
import com.example.security.utils.Encoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    private AuthRepository authRepository;

    public UserService(UserRepository userRepository, AuthRepository authRepository) {
        this.userRepository = userRepository;
        this.authRepository = authRepository;
    }

    public void saveUser(RegisterDTO registerDTO) {
        User user = new User();
        Auth auth = new Auth();
        user.setFirstName(registerDTO.firstName);
        user.setLastName(registerDTO.lastName);
        user.setUsername(registerDTO.username);
        auth.setUsername(registerDTO.username);
        auth.setPassword(Encoder.getPassword(registerDTO.password));
        userRepository.save(user);
        authRepository.save(auth);
    }
}
