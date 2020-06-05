package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    @Test
    public void constructorTest(){
    //tESTING ESCENARIO FOR CONSTRUCTOR
        //Given
        String first = "Madlyn";
        String last = "Espinoza";
        int energy = 50;


        //When
        Human testHuman= new Human(first,last);
        String actualFirst = testHuman.getFirst();
        String actualLast = testHuman.getLast();
        int actualEnergy =testHuman.getEnergy();

        //Then-- comparison
        Assert.assertEquals(first,actualFirst);
        Assert.assertEquals(last, actualLast);
        Assert.assertEquals(energy, actualEnergy);


    }

    @Test
    public void eatTest(){
        //Given 
        Fruit pineaple = new Fruit("Pineaple", 10);
        int expectedEnergy = 60;
        Human testHuman = new Human("Barney", "Rubble");

        //When
        testHuman.eat(pineaple);
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void workTest(){
        //Given
        Human testHuman = new Human("Madlyn", "Espinoza");
        int expectedEnergy= 30;
        //When
        testHuman.work(2);
        //confusing
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }
    @Test
    public void energyMaxTest(){
        //Given
        Human testHuman = new Human("Wilma", "Flimstone");
        Fruit testFruit1 = new Fruit("Dragon Fruit", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("Apple", 20);
        Human.maxEnergy = 100;
        

        //When
        testHuman.eat(testFruit1);
        testHuman.eat(testFruit2);
        testHuman.eat(testFruit3);
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(100, actualEnergy);


    }
    @Test
    public void workMin(){
        //Given
        Human testHuman = new Human("Wilma", "Flimstone");

        //When
        testHuman.work(6);
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(50, actualEnergy);
    }
    @Test
    public void maxEnergyChangeTest(){
        //Given
        Human h1 = new Human("John", "Doe");
        Fruit testFruit1 = new Fruit("Dragon Fruit", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("Apple", 20);

       
        //When
        Human.maxEnergy = 150;
        h1.eat(testFruit1);
        h1.eat(testFruit2);
        h1.eat(testFruit3);
        int actualEnergy = h1.getEnergy();

        //Then
        Assert.assertEquals(110, actualEnergy);
    }

}