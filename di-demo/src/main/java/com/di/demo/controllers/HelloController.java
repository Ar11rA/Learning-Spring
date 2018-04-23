package com.di.demo.controllers;

import com.di.demo.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    private IGreetingService greetingService;

    public HelloController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
