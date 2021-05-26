package com.example.dependency_injection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class I18NEnglishService  implements GreetingService {
    @Override
    public String greeting() {
        return "English__hello world";
    }
}
