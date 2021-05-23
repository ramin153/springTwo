package com.example.dependency_injection.controller;

import com.example.dependency_injection.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedGreetingController {
    @Autowired
    public GreetingService greetingService;

    public String getGreeting()
    {
        return greetingService.greeting();
    }
}
