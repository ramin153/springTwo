package com.example.dependency_injection.service;

import org.springframework.stereotype.Service;

import javax.annotation.processing.Generated;


public class ConstructorGreetingServiceI implements GreetingService {


    public String greeting() {
        return "Constructor__GreetingServiceI";
    }
}
