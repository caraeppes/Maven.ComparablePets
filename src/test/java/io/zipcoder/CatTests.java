package io.zipcoder;

import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class CatTests {

    @Test
    public void CatNullConstructorTest(){
        // Given
        Cat cat = new Cat();

        // When
        String actual = cat.getName();

        // Then
        Assert.assertEquals("", actual);
    }


    @Test
    public void CatConstructorWithName(){
        // Given
        String expected = "Gilligan";
        Cat cat = new Cat(expected);

        // When
        String actual = cat.getName();

        // Then
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void CatSpeakTest(){
        // Given
        Cat cat = new Cat();
        String expected = "Meow!";

        // When
        String actual = cat.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void CatPolymorphismTest(){
        // Given
        Cat cat = new Cat();

        // When
        Boolean actual = cat instanceof Pet;

        // Then
        Assert.assertTrue(actual);
    }

}


