package com.example.dependency_injection.config;

import com.example.dependency_injection.datasource.FakeData;
import com.example.dependency_injection.repositores.EnglishRepositoryGreeting;
import com.example.dependency_injection.repositores.EnglishRepositoryGreetingImpl;
import com.example.dependency_injection.service.*;
import com.example.pet.PetService;
import com.example.pet.PetServiceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;


@ImportResource("classpath:sfgdl-config.xml")
@Configuration
public class GreetingConfig {


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

    @Bean
    EnglishRepositoryGreeting englishRepositoryGreeting()
    {
        return new EnglishRepositoryGreetingImpl();
    }



    @Profile("EN")
    @Bean("i18NService")
    I18NEnglishService i18NEnglishService(EnglishRepositoryGreeting englishRepositoryGreeting)
    {
        return new I18NEnglishService(englishRepositoryGreeting);
    }


    @Bean
    PetServiceFactory petServiceFactory()
    {
        return new PetServiceFactory();
    }

    @Profile({"cat","default"})
    @Bean("petService")
    PetService catPetService(PetServiceFactory petServiceFactory)
    {
        return petServiceFactory.getPetService("cat");
    }

    @Profile({"dog"})
    @Bean("petService")
    PetService dogPetService(PetServiceFactory petServiceFactory)
    {
        return petServiceFactory.getPetService("dog");
    }

    @Bean
    FakeData fakeData(@Value("${com.example.dependency_injection.userName}") String username,
                      @Value("${com.example.dependency_injection.password}") String password,
                      @Value("${com.example.dependency_injection.JDBCurl}") String jdbcurl)
    {
        FakeData fakeData = new FakeData();
        fakeData.setPassword(password);
        fakeData.setUserName(username);
        fakeData.setJDBCurl(jdbcurl);
        return fakeData;
    }



}
