package com.example.dependency_injection.config;

import com.example.dependency_injection.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingConfig {

    @Bean
     ConstructorGreetingServiceI constructorGreetingServiceI()
    {
        return new ConstructorGreetingServiceI();
    }

    @Bean
    PropertyGreetingServiceI propertyGreetingServiceI()
    {
        return new PropertyGreetingServiceI();
    }

    @Bean
    SetterGreetingServiceI setterGreetingServiceI()
    {
        return new SetterGreetingServiceI();
    }

    @Primary
    @Bean
    PrimaryGreetingServiceI primaryGreetingServiceI()
    {
        return new PrimaryGreetingServiceI();
    }

    @Profile({"FA","default"})
    @Bean("i18NService")//it would override the function name
    I18NPersianService i18NPersianService()
    {
        return new I18NPersianService();
    }

    @Profile("EN")
    @Bean("i18NService")
    I18NEnglishService i18NEnglishService()
    {
        return new I18NEnglishService();
    }


}
