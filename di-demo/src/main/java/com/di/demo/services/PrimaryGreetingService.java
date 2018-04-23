package com.di.demo.services;

import com.di.demo.repositories.IGreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements IGreetingService {

    private IGreetingRepository greetingRepository;

    public PrimaryGreetingService(IGreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}