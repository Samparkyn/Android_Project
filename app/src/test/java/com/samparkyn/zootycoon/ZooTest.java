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
        Animal tiger = new Animal("Tiger");
        zoo.addAnimal(tiger);
        assertEquals(1, zoo.getCapacity());
    }

    @Test
    public void testFeedAnimal(){
        Zoo zoo = new Zoo();
        Animal tiger = new Animal("Tiger");
        assertEquals(100,zoo.feedAnimal(tiger));

    }

    @Test
    public void testZooIncome(){
        Zoo zoo = new Zoo();
        Animal tiger = new Animal("Tiger");
        Animal penguin = new Animal("Penguin");
        Animal panda = new Animal("Panda");
        zoo.addAnimal(tiger);
        zoo.addAnimal(penguin);
        zoo.addAnimal(panda);
        assertEquals(75, zoo.getIncome());
    }
}
