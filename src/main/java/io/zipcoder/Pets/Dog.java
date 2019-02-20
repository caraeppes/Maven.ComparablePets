package io.zipcoder.Pets;

public class Dog extends Pet {

    public Dog(){
        this.setName("Dog name");
    }

    public Dog(String name){
        super(name);
    }

    public String speak(){
        return "Bark!";
    }
}
