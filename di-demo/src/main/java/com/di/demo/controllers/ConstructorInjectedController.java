package com.di.demo.controllers;

import com.di.demo.services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private IGreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
