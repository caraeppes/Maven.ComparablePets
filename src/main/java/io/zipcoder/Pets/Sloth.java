package io.zipcoder.Pets;

public class Sloth extends Pet {

    public Sloth(){
        this.setName("Sloth name");
    }

    public Sloth(String name){
        super(name);
    }

    public String speak(){
        return "Squeak!";
    }
}
