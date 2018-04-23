package com.di.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
    public static final String ORIGINAL_HELLO = "Hello from the original side!";

    @Override
    public String sayGreeting() {
        return ORIGINAL_HELLO;
    }
}

