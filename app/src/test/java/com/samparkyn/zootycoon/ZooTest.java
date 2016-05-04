package com.samparkyn.zootycoon;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 29/04/16.
 */
public class ZooTest {

    @Test
    public void testZooCapacity(){
        Zoo zoo = new Zoo();
        Animal tiger = new Animal("Tiger", 30);
        Animal penguin = new Animal("Penguin", 50);
        Animal panda = new Animal("Panda", 60);
        zoo.addAnimal(tiger);
        zoo.addAnimal(penguin);
        zoo.addAnimal(panda);
        assertEquals(3, zoo.getCapacity());
    }

    @Test
    public void testFeedAnimal(){
        Zoo zoo = new Zoo();
        Animal tiger = new Animal("Tiger", 30);
        assertEquals(40,zoo.feedAnimal(tiger));

    }

    @Test
    public void testZooIncome(){
        Zoo zoo = new Zoo();
        Animal tiger = new Animal("Tiger", 30);
        Animal penguin = new Animal("Penguin", 50);
        Animal panda = new Animal("Panda", 60);
        zoo.addAnimal(tiger);
        zoo.addAnimal(penguin);
        zoo.addAnimal(panda);
        assertEquals(75, zoo.getIncome());
    }

    @Test
    public void testEndDay(){
        Zoo zoo = new Zoo();
        Animal tiger = new Animal("Tiger", 30);
        Animal penguin = new Animal("Penguin", 50);
        Animal panda = new Animal("Panda", 60);
        zoo.addAnimal(tiger);
        zoo.addAnimal(penguin);
        zoo.addAnimal(panda);
        zoo.endDay();
        assertEquals(0, tiger.getHungerLevel());


    }
}
