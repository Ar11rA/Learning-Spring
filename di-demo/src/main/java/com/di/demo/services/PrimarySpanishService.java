package com.di.demo.services;

import com.di.demo.repositories.IGreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishService implements IGreetingService{

    private IGreetingRepository greetingRepository;

    public PrimarySpanishService(IGreetingRepository greetingRepository) {
            this.greetingRepository = greetingRepository;
    }
    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}

