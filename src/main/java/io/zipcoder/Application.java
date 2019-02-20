package io.zipcoder;


import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Pet;
import io.zipcoder.Pets.Sloth;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

    private static final IOConsole console = new IOConsole(System.in, System.out);


    public static void main(String[] args) {

        List<Pet> petList = new ArrayList<Pet>();
        Integer numberOfPets = console.getIntegerInput("How many pets do you have? ");
        console.getStringInput("");

        for (int i = 0; i < numberOfPets; i++) {
            String petType = console.getStringInput("What kind of pet do you have? ");
            String petName = console.getStringInput("What is your pets name? ");
            if (petType.equals("Dog")) {
                petList.add(new Dog(petName));
            }
            if (petType.equals("Cat")) {
                petList.add(new Cat(petName));
            }
            if (petType.equals("Sloth")) {
                petList.add(new Sloth(petName));

            }
        }
        for (Pet p : petList) {
            String petType = getPetType(p);
            console.println("You have a %s named %s.", petType, p.getName());
            console.println("%s says %s", p.getName(), p.speak());
        }

        Collections.sort(petList);
        console.println("\nYour pets sorted by name:");
        for (Pet p : petList){
            String petType = getPetType(p);
            console.println("%s the %s", p.getName(), petType);
        }

        Collections.sort(petList, new PetComparator());
        console.println("\nYour pets sorted by class:");
        for (Pet p : petList){
            String petType = getPetType(p);
            console.println("%s named %s",  petType, p.getName());
        }
    }

    public static String getPetType(Pet p){
        if (p instanceof Dog) {
            return "Dog";
        }
        if (p instanceof Cat) {
            return "Cat";
        }
        if (p instanceof Sloth) {
            return "Sloth";
        }
        else {
            return "Not a supported pet";
        }
    }


}