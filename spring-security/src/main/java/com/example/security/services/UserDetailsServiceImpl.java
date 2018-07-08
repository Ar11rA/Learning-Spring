package com.example.security.services;

import com.example.security.domains.Auth;
import com.example.security.domains.Role;
import com.example.security.repositories.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private AuthService authService;
    private UserRepository userRepository;

    public UserDetailsServiceImpl(AuthService authService, UserRepository userRepository) {
        this.authService = authService;
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Auth auth = authService.findUserByUsername(username);
        com.example.security.domains.User user = userRepository.findUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(
                user.getUsername(),
                auth.getPassword(),
                getAdminAuthority(user.getRoles())
                );
    }

    private  List<GrantedAuthority> getAdminAuthority(Collection<Role> userRoles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for(Role role : userRoles) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.name));
        }
        return authorities;
    }

}