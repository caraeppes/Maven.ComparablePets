package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PetTest {
    Pet givenPet;
    String givenName;

    @Before
    public void setup(){
        givenName = "someName";
        givenPet = new Pet(givenName);
    }
    @Test
    public void speakTest(){
        //When
        String retrievedWords = givenPet.speak();

    }

    @Test
    public void getNameTest(){
        //When
        String retrievedWords = givenPet.getName();

    }

    @Test
    public void defaultConstructorTest(){
        //When
        Pet newPet = new Pet();

    }

    @Test
    public void ConstructorWithNameTest(){
        //When
        Pet newPet = new Pet("test");

    }

    @Test
    public void polymorphismTest(){
        //When
        Pet newPet = new Cat();
        boolean isCat = newPet instanceof Cat;
        Assert.assertTrue(isCat);

        newPet = new Dog();
        boolean isDog = newPet instanceof Dog;
        Assert.assertTrue(isDog);



    }
}
