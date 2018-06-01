package com.example.security.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "api/v1/secure")
public class ClosedController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> GetHello() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
