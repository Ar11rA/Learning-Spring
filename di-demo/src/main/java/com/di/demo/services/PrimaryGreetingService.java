package com.di.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements IGreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting service";
    }
}
