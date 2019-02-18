package io.zipcoder;

import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Pet;
import io.zipcoder.Pets.Sloth;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class PetTests {

    @Test
    public void PetNullConstructorTest(){
        // Given
        Pet pet = new Pet();

        // When
        String actual = pet.getName();

        // Then
        Assert.assertEquals("", actual);
    }

    @Test
    public void PetConstructorWithNameTest(){
        // Given
        String expected = "Puffy Fluffy";
        Pet pet = new Pet(expected);

        // When
        String actual = pet.getName();

        // Then
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void SetNameTest(){
        // Given
        Pet pet = new Pet();
        String expected = "Gilligan";

        // When
        pet.setName(expected);
        String actual = pet.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void PetSpeakTest(){
        // Given
        Pet pet = new Pet();
        String expected = "RANDOMANIMALSOUND!";

        // When
        String actual = pet.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void PetNameCompareToTest(){
        // Given
        Pet p1 = new Cat("Gilligan");
        Pet p2 = new Dog("Puffy Fluffy");
        Pet p3 = new Dog("Jumbi");
        Pet p4 = new Sloth("Slothyboo");
        Pet p5 = new Cat("Slothyboo");
        Pet p6 = new Dog("Gilligan");

        // When
        int actual1 = p1.compareTo(p2);
        int actual2 = p2.compareTo(p1);
        int actual3 = p3.compareTo(p1);
        int actual4 = p1.compareTo(p4);
        int actual5 = p4.compareTo(p2);
        int actual6 = p2.compareTo(p2);
        int actual7 = p4.compareTo(p5);
        int actual8 = p1.compareTo(p6);

        // Then
        Assert.assertTrue(actual1 < 0);
        Assert.assertTrue(actual2 > 0);
        Assert.assertTrue(actual3 > 0);
        Assert.assertTrue(actual4 < 0);
        Assert.assertTrue(actual5 > 0);
        Assert.assertTrue(actual6 == 0);
        Assert.assertTrue(actual7 > 0);
        Assert.assertTrue(actual8 < 0);
    }

    @Test
    public void PetArraySortTest(){
        // Given
        Pet p1 = new Cat("Gilligan");
        Pet p2 = new Dog("Puffy Fluffy");
        Pet p3 = new Dog("Jumbi");
        Pet p4 = new Sloth("Slothyboo");
        Pet p5 = new Cat("Slothyboo");
        Pet p6 = new Dog("Gilligan");
        Pet[] petArray = new Pet[] {p1, p2, p3, p4, p5, p6};
        Pet[] expected = new Pet[] {p1, p6, p3, p2, p5, p4};

        // When
        Arrays.sort(petArray);

        // Then
        Assert.assertArrayEquals(expected, petArray);
    }

    @Test
    public void PetCollectionsSortTest(){
        // Given
        Pet p1 = new Cat("Gilligan");
        Pet p2 = new Dog("Puffy Fluffy");
        Pet p3 = new Dog("Jumbi");
        Pet p4 = new Sloth("Slothyboo");
        Pet p5 = new Cat("Slothyboo");
        Pet p6 = new Dog("Gilligan");
        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(p1);
        petList.add(p2);
        petList.add(p3);
        petList.add(p4);
        petList.add(p5);
        petList.add(p6);
        Pet[] expected = new Pet[]{p1, p6, p3, p2, p5, p4};

        // When
        Collections.sort(petList);
        Pet[] actual = new Pet[petList.size()];
        for (int i = 0; i < petList.size(); i++){
            actual[i] = petList.get(i);
        }


        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void PetComparatorTest(){
        // Given
        PetComparator petComparator = new PetComparator();
        Pet p1 = new Cat("Gilligan");
        Pet p2 = new Dog("Puffy Fluffy");
        Pet p3 = new Dog("Jumbi");
        Pet p4 = new Sloth("Slothyboo");
        Pet p5 = new Cat("Slothyboo");
        Pet p6 = new Dog("Gilligan");
        Pet p7 = new Sloth("Slothmaster");
        Pet[] petArray = new Pet[] {p1, p2, p3, p4, p5, p6, p7};
        Pet[] expected = new Pet[] {p1, p5, p6, p3, p2, p7, p4};

        // When
        Arrays.sort(petArray, petComparator);

        // Then
        Assert.assertArrayEquals(expected, petArray);
    }
}

