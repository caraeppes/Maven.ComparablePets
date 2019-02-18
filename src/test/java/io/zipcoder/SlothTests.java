package io.zipcoder;

import io.zipcoder.Pets.Pet;
import io.zipcoder.Pets.Sloth;
import org.junit.Assert;
import org.junit.Test;

public class SlothTests {

    @Test
    public void SlothNullConstructorTest(){
        // Given
        Sloth sloth = new Sloth();

        // When
        String actual = sloth.getName();

        // Then
        Assert.assertEquals("", actual);
    }


    @Test
    public void SlothConstructorWithName(){
        // Given
        String expected = "Slothyboo";
        Sloth sloth = new Sloth(expected);

        // When
        String actual = sloth.getName();

        // Then
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void SlothSpeakTest(){
        // Given
        Sloth sloth = new Sloth();
        String expected = "Squeeeeeak!";

        // When
        String actual = sloth.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void SlothPolymorphismTest(){
        // Given
        Sloth sloth = new Sloth();

        // When
        Boolean actual = sloth instanceof Pet;

        // Then
        Assert.assertTrue(actual);
    }



}
