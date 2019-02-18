package io.zipcoder.Pets;

public class Dog extends Pet {

    public Dog(){
        super();
    }

    public Dog(String name){
        super(name);
    }

    public String speak(){
        return "BARK!";
    }
}
