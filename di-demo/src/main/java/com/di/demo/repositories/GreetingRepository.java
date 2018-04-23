package com.di.demo.repositories;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepository implements IGreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }
}
