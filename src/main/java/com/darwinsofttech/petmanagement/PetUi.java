package com.darwinsofttech.petmanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetUi {
    BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

    public String askForPetName() throws IOException {
        System.out.print("Enter new name: ");
        return rdr.readLine();
    }

    public String askForPetBreed() throws IOException {
        System.out.println("Enter new breed: ");
        return rdr.readLine();
    }
}
