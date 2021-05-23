package com.example.dependency_injection.service;

import org.springframework.stereotype.Service;

import javax.annotation.processing.Generated;

@Service
public class ConstructorGreetingServiceI implements GreetingService {

    @Override
    public String greeting() {
        return "Constructor__GreetingServiceI";
    }
}
