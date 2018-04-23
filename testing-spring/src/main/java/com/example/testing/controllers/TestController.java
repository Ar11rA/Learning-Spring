package com.example.testing.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(method = RequestMethod.GET, path = "/test")
    public ResponseEntity<String> getIndex() {
        System.out.println("Test");
        return new ResponseEntity<>("index", HttpStatus.OK);
    }
}
