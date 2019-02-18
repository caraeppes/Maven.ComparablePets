package io.zipcoder;

import io.zipcoder.Pets.Pet;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {

    public int compare(Pet p1, Pet p2) {

        if ((p1.getClass().toString().compareTo(p2.getClass().toString())) != 0){
            return (p1.getClass().toString().compareTo(p2.getClass().toString()));
        }
        else {
            return p1.getName().compareTo(p2.getName());
        }
    }
}
