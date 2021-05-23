package com.example.dependency_injection.controller;

import com.example.dependency_injection.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    private final GreetingService greetingService;

    public TestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getText()
    {

        return greetingService.greeting();
    }
}
