package com.darwinsofttech.petguardian;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PetGuardianRepository {

    private static HashMap petGuardianHashMap = new HashMap();

    public PetGuardianRepository(){
        PetGuardian petGuardian = new PetGuardian();

        petGuardian.setName("Darwin D. Zaldarriaga");
        petGuardian.setAddress("Jaro");
        petGuardian.setContactNumber(12345);

        petGuardianHashMap.put(1, petGuardian);

        petGuardian.setName("Stefanie Aguiling");
        petGuardian.setAddress("Lapaz");
        petGuardian.setContactNumber(67890);

        petGuardianHashMap.put(2, petGuardian);

        petGuardian.setName("Sophie Isobel Zaldarriaga");
        petGuardian.setAddress("Jaro");
        petGuardian.setContactNumber(13579);

        petGuardianHashMap.put(3, petGuardian);
    }

    public static void addPetGuardian(PetGuardian petGuardian){
        int newHashMapKey = petGuardianHashMap.size() + 1;
        petGuardianHashMap.put(newHashMapKey, petGuardian);
    }

    public static HashMap getPetGuardianRepository(){
        return petGuardianHashMap;
    }
}
