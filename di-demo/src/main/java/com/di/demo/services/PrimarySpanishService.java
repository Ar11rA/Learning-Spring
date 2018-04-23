package com.di.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishService implements IGreetingService{

    @Override
    public String sayGreeting() {
        return "Hola - Primario servicio";
    }
}

