package com.samparkyn.zootycoon;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 29/04/16.
 */
public class AnimalTest {

    @Test
public void testAnimalSpecies() {
    Animal tiger = new Animal("tiger");
        assertEquals("tiger", tiger.getSpecies());
    }

    @Test
    public void testAnimalHunger(){
        Animal tiger = new Animal("Tiger");
        assertEquals(100, tiger.getHungerLevel());
    }

}
