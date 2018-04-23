package com.di.demo.controllers;

import com.di.demo.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingService")
    public IGreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}