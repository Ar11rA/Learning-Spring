package com.example.security.services;

import com.example.security.domains.Auth;
import com.example.security.repositories.AuthRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.example.security.auth.SecurityConstants.EXPIRATION_TIME;
import static com.example.security.auth.SecurityConstants.SECRET;

@Service
public class AuthService {

    private AuthRepository authRepository;

    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    public Auth findUserByUsername(String username) {
        return authRepository.findAuthByUsername(username);
    }

    public Boolean isUserValid(String username, String password) {
        Auth user = authRepository.findAuthByUsername(username);
        if(user == null){
            return false;
        }
        return BCrypt.checkpw(password, user.getPassword());
    }

    public String getJWTToken(String username) {
        String token = Jwts.builder()
                .setSubject(username)
                .claim("name", username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
        return token;
    }
}
