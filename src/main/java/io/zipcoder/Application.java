package io.zipcoder;


import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Pet;
import io.zipcoder.Pets.Sloth;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private static Scanner scanner = new Scanner(System.in);
    private static Integer numberOfPets;
    private static ArrayList<String> typesOfPets = new ArrayList<String>();
    private static ArrayList<String> namesOfPets = new ArrayList<String>();
    private static ArrayList<Pet> pets = new ArrayList<Pet>();

    public static void main(String[] args) {
        System.out.println("Hello! How many pets do you have?");
        numberOfPets = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfPets; i++){
            System.out.println("What kind of pet do you have?");
            typesOfPets.add(scanner.nextLine());
            System.out.println("What is your pets name?");
            namesOfPets.add(scanner.nextLine());
        }

        for (int i = 0; i < numberOfPets; i++){
            if (typesOfPets.get(i).equals("Dog")){
                pets.add(new Dog(namesOfPets.get(i)));
            }
            else if (typesOfPets.get(i).equals("Cat")){
                pets.add(new Cat(namesOfPets.get(i)));
            }
            else if (typesOfPets.get(i).equals("Sloth")){
                pets.add(new Sloth(namesOfPets.get(i)));
            }
        }

        System.out.println("You have a:");
        for (int i = 0; i < numberOfPets; i++){
            System.out.println(typesOfPets.get(i) + " named " + namesOfPets.get(i));
        }

        for (int i = 0; i < numberOfPets; i++){
            System.out.println(pets.get(i).getName() + " says " + pets.get(i).speak());
        }
    }
}
