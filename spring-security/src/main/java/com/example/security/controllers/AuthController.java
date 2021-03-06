package com.example.security.controllers;

import com.example.security.DTOs.LoginDTO;
import com.example.security.DTOs.RegisterDTO;
import com.example.security.services.AuthService;
import com.example.security.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "api/v1/auth")
public class AuthController {

    private AuthService authService;
    private UserService userService;

    public AuthController(AuthService authService, UserService userService) {
        this.authService = authService;
        this.userService = userService;
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public ResponseEntity<String> Login(@RequestBody LoginDTO loginDTO) {
        if(!authService.isUserValid(loginDTO.username, loginDTO.password)) {
            return new ResponseEntity<>("Login Failed!", HttpStatus.UNAUTHORIZED);
        }
        String token = authService.getJWTToken(loginDTO.username);
        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public ResponseEntity<String> Register(@RequestBody RegisterDTO registerDTO){
        userService.saveUser(registerDTO);
        return new ResponseEntity<>("Saved", HttpStatus.OK);
    }

}
