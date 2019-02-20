package io.zipcoder;

import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {

    Cat givenCat;
    String givenName;

    @Before
    public void setup(){
        givenName = "someName";
        givenCat = new Cat(givenName);
    }

    @Test
    public void speakTest(){
        //when
        String wordsRetrieved = givenCat.speak();
        Assert.assertEquals(wordsRetrieved, "Meow!");
    }

    @Test
    public void getNameTest(){
        //when
        String retrievedName = givenCat.getName();
        Assert.assertEquals(retrievedName,givenName);
    }

    @Test
    public void defaultConstructorTest(){
        Cat newCat = new Cat();
        String retrievedName = newCat.getName();
        Assert.assertEquals(retrievedName,"Cat name");

    }

    @Test
    public void ConstructorWithNameTest(){
        //When
        String newName = "newName";
        Cat newCat = new Cat(newName);
        String retrievedName = newCat.getName();
        Assert.assertEquals(newName, retrievedName);
    }

    @Test
    public void polymorphismTest(){
        Pet pet = new Cat();
        boolean isCat = pet instanceof Cat;
        Assert.assertTrue(isCat);
    }
}
