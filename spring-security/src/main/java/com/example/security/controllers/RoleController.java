package com.example.security.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "api/v1/role")
public class RoleController {

    @RequestMapping(path = "/bye", method = RequestMethod.GET)
    public ResponseEntity<String> GetBye() {
        SecurityContext securityContext = SecurityContextHolder.getContext(); // to get claims
        return new ResponseEntity<>("Bye", HttpStatus.OK);
    }

}
