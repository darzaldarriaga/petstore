package com.darwinsofttech.petguardian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetGuardianUi {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String askForPetGuardianName()throws IOException {
        System.out.print("\nEnter new guardian name: ");
        return reader.readLine();
    }

    public String askForPetGuardianAddress() throws IOException {
        System.out.print("\nEnter the guardian's address: ");
        return reader.readLine();
    }

    public int askForPetGuardianContactNumber() throws IOException {
        try {
            System.out.print("\nEnter the guardian's contact number: ");
            return Integer.parseInt(reader.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("\nPlease enter numbers only");
            return -1;
        }
    }
}
