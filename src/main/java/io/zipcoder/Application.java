package io.zipcoder;


import io.zipcoder.Pets.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private static Scanner scanner = new Scanner(System.in);
    private static Integer numberOfPets;
    private static ArrayList<String> typesOfPets = new ArrayList<String>();
    private static ArrayList<String> namesOfPets = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println("Hello! How many pets do you have?");
        numberOfPets = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfPets; i++){
            System.out.println("What kind of pet do you have?");
            typesOfPets.add(scanner.nextLine());
            System.out.println("What is your pets name?");
            namesOfPets.add(scanner.nextLine());
        }

        System.out.println("You have a:");
        for (int i = 0; i < numberOfPets; i++){
            System.out.println(typesOfPets.get(i) + " named " + namesOfPets.get(i));
        }

    }
}
