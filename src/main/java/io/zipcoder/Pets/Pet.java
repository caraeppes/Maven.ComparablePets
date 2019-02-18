package io.zipcoder.Pets;

public class Pet implements Comparable<Pet>{

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
}
