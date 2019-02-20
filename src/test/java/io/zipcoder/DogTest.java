package io.zipcoder;

import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {
    Dog givenDog;
    String givenName;

    @Before
    public void setup(){
        givenName = "someName";
        givenDog = new Dog(givenName);
    }

    @Test
    public void speakTest(){
        //when
        String wordsRetrieved = givenDog.speak();
        Assert.assertEquals(wordsRetrieved, "Bark!");
    }

    @Test
    public void getNameTest(){
        //when
        String retrievedName = givenDog.getName();
        Assert.assertEquals(retrievedName,givenName);
    }

    @Test
    public void defaultConstructorTest(){
        Dog newDog = new Dog();
        String retrievedName = newDog.getName();
        Assert.assertEquals(retrievedName,"Dog name");

    }

    @Test
    public void ConstructorWithNameTest(){
        //When
        String newName = "newName";
        Dog newDog = new Dog(newName);
        String retrievedName = newDog.getName();
        Assert.assertEquals(newName, retrievedName);
    }

    @Test
    public void polymorphismTest(){
        Pet pet = new Dog();
        boolean isDog = pet instanceof Dog;
        Assert.assertTrue(isDog);
    }
}
