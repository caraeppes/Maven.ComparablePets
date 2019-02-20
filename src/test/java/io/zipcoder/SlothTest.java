package io.zipcoder;

import io.zipcoder.Pets.Pet;
import io.zipcoder.Pets.Sloth;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SlothTest {
    Sloth givenSloth;
    String givenName;

    @Before
    public void setup() {
        givenName = "someName";
        givenSloth = new Sloth(givenName);
    }

    @Test
    public void speakTest() {
        //when
        String wordsRetrieved = givenSloth.speak();
        Assert.assertEquals(wordsRetrieved, "Squeak!");
    }

    @Test
    public void getNameTest() {
        //when
        String retrievedName = givenSloth.getName();
        Assert.assertEquals(retrievedName, givenName);
    }

    @Test
    public void defaultConstructorTest() {
        Sloth newSloth = new Sloth();
        String retrievedName = newSloth.getName();
        Assert.assertEquals(retrievedName, "Sloth name");

    }

    @Test
    public void ConstructorWithNameTest() {
        //When
        String newName = "newName";
        Sloth newSloth = new Sloth(newName);
        String retrievedName = newSloth.getName();
        Assert.assertEquals(newName, retrievedName);
    }

    @Test
    public void polymorphismTest() {
        Pet pet = new Sloth();
        boolean isSloth = pet instanceof Sloth;
        Assert.assertTrue(isSloth);
    }
}
