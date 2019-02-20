package io.zipcoder.Pets;

public class Cat extends Pet {

    public Cat(){
        this.setName("Cat name");
    }

    public Cat (String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Meow!";
    }

}
