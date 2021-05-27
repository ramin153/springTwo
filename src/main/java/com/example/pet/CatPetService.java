package com.example.pet;

public class CatPetService implements PetService{
    @Override
    public String speak() {
        return "meow meow";
    }
}
