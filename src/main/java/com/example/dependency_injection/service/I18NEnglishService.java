package com.example.dependency_injection.service;

import com.example.dependency_injection.repositores.EnglishRepositoryGreeting;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class I18NEnglishService  implements GreetingService {
    private final EnglishRepositoryGreeting englishRepositoryGreeting;

    public I18NEnglishService(EnglishRepositoryGreeting englishRepositoryGreeting) {
        this.englishRepositoryGreeting = englishRepositoryGreeting;
    }

    @Override
    public String greeting() {
        return englishRepositoryGreeting.getText();
    }
}
