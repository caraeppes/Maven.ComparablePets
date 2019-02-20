package io.zipcoder;


import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Sloth;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {

    private Pets pets;

    @Before
    public void setup(){
        pets = new Pets();
        pets.add(new Dog("dog1"));
        pets.add(new Cat("cat1"));
        pets.add(new Sloth("sloth1"));
    }

    @Test
    public void numberOfPetsTest(){
        //When
        int noOfPets = pets.getNumberOfPets();
        Assert.assertEquals(noOfPets, 3);
    }

    @Test
    public void getNamesOfPetsTest(){
        //When
        String[] petsName = pets.getNamesOfPets();

        //Then
        Assert.assertEquals(petsName.length, 3);
        Assert.assertEquals(petsName[0], "dog1");
        Assert.assertEquals(petsName[1], "cat1");
        Assert.assertEquals(petsName[2], "sloth1");

    }

    @Test
    public void sortTest()
    {
        //When
        pets.sort();

        //Then
        String[] petsName = pets.getNamesOfPets();

        Assert.assertEquals(petsName.length, 3);
        Assert.assertEquals(petsName[0], "cat1");
        Assert.assertEquals(petsName[1], "dog1");
        Assert.assertEquals(petsName[2], "sloth1");
    }
}
