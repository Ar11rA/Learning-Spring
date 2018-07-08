package com.example.security.services;

import com.example.security.DTOs.RegisterDTO;
import com.example.security.domains.Role;
import com.example.security.domains.Auth;
import com.example.security.domains.User;
import com.example.security.repositories.AuthRepository;
import com.example.security.repositories.RoleRepository;
import com.example.security.repositories.UserRepository;
import com.example.security.utils.Encoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserService {

    private UserRepository userRepository;
    private AuthRepository authRepository;
    private RoleRepository roleRepository;

    public UserService(UserRepository userRepository, AuthRepository authRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.authRepository = authRepository;
        this.roleRepository = roleRepository;
    }

    public void saveUser(RegisterDTO registerDTO) {
        User user = new User();
        Auth auth = new Auth();
        user.setFirstName(registerDTO.firstName);
        user.setLastName(registerDTO.lastName);
        user.setUsername(registerDTO.username);
        String[] roles = registerDTO.roles.split(",");
        Collection<Role> userRoles = new ArrayList<>();
        for (String role: roles ) {
            if(roleRepository.existsByName(role)) {
                userRoles.add(roleRepository.findRoleByName(role));
            }
            else {
                userRoles.add(new Role(role));
                roleRepository.save(new Role(role));
            }

        }
        user.setRoles(userRoles);
        auth.setUsername(registerDTO.username);
        auth.setPassword(Encoder.getPassword(registerDTO.password));
        userRepository.save(user);
        authRepository.save(auth);
    }
}
