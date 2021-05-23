package com.example.dependency_injection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryGreetingServiceI implements GreetingService {
    @Override
    public String greeting() {
        return "Primary__GreetingService";
    }
}
