package com.darwinsofttech.petmanagement;

import java.util.ArrayList;

public class PetRepository {

    private static ArrayList<Pet> petArray = new ArrayList<Pet>();

    public PetRepository(){
        Pet pet = new Pet();

        pet.setName("Nana");
        pet.setBreed("Jack Russell");
        petArray.add(pet);

        pet.setName("Pixie");
        pet.setBreed("Shih Tzu");
        petArray.add(pet);

        pet.setName("Doge");
        pet.setBreed("Corgi");
        petArray.add(pet);

        pet.setName("Bruce");
        pet.setBreed("Samoyed");
        petArray.add(pet);
    }

    public void addPet(Pet pet){
        petArray.add(pet);
    }

    public static ArrayList<Pet> getPetRepository(){
        return petArray;
    }
}
