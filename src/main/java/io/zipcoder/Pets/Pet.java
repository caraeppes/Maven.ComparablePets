package io.zipcoder.Pets;

public class Pet {

    private String name;

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
        return null;
    }
}
