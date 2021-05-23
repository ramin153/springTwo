package com.example.dependency_injection.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceI implements GreetingService {

    @Override
    public String greeting() {
        return "Setter___GreetingServiceI";
    }
}
