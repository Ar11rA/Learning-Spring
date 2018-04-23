package com.di.demo.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the property!!!";
    }
}
