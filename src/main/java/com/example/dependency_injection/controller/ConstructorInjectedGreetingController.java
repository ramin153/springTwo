package com.example.dependency_injection.controller;

import com.example.dependency_injection.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedGreetingController {


    private final GreetingService greetingService;


    //    @Autowired is optional
    public ConstructorInjectedGreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.greeting();
    }
}
