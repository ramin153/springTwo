package com.example.dependency_injection.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceI implements GreetingService {

    @Override
    public String greeting() {
        return "Property__GreetingServiceI";
    }
}
