package com.di.demo.controllers;

import com.di.demo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    private GreetingService greetingService;

    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
