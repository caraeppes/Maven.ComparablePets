package io.zipcoder.Pets;

import java.util.ArrayList;
import java.util.Collections;

public class Pet implements Comparable<Pet>{

    private String name;
    private ArrayList<Pet> petList = new ArrayList<Pet>();

    public Pet(){
        this.name = "";
    }

    public Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "RANDOMANIMALSOUND!";
    }

    public int compareTo(Pet o) {
        if(this.name.compareTo(o.name) != 0){
            return this.name.compareTo(o.name);
        }
        else {
            return this.getClass().toString().compareTo(o.getClass().toString());
        }
    }

    public ArrayList<Pet> getPetList() {
        return petList;
    }

    public int getNumberOfPets() {
        return petList.size();
    }

    public String[] getNamesOfPets() {
        String[] petNames = new String[petList.size()];
        for(int i = 0; i < petList.size(); i++){
            petNames[i] = petList.get(i).getName();
        }
        return petNames;
    }

    public void sort(){
        Collections.sort(petList);
    }
}
