package com.example.dependency_injection.config;

import com.example.dependency_injection.service.ConstructorGreetingServiceI;
import com.example.dependency_injection.service.PropertyGreetingServiceI;
import com.example.dependency_injection.service.SetterGreetingServiceI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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


}
