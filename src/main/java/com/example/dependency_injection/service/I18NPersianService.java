package com.example.dependency_injection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FA")
@Service("i18NService")
public class I18NPersianService implements GreetingService {
    @Override
    public String greeting() {
        return "Persian__hello world";
    }
}
