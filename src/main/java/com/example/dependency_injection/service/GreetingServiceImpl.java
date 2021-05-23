package com.example.dependency_injection.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "GreetingServiceImpl";
    }
}
