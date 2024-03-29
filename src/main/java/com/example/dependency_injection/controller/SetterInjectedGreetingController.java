package com.example.dependency_injection.controller;

import com.example.dependency_injection.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedGreetingController {


    private GreetingService greetingService;

    @Qualifier("setterGreetingServiceI")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.greeting();
    }
}
