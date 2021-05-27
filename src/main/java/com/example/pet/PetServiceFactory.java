package com.example.pet;

import java.util.Locale;

public class PetServiceFactory {
    public PetService getPetService(String petType)
    {
        switch (petType.toLowerCase(Locale.ROOT))
        {
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }

}
