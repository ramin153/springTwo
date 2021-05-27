package com.example.dependency_injection.controller;

import com.example.pet.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetServiceController {
    private final PetService petService;

    public PetServiceController(@Qualifier("petService")PetService petService) {
        this.petService = petService;
    }
    public String getString()
    {
        return petService.speak();
    }
}
