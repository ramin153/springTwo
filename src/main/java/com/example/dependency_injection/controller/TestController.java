package com.example.dependency_injection.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {

    public String getText()
    {
        System.out.println("hello world");

        return "test controller";
    }
}
