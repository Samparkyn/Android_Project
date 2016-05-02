package com.samparkyn.zootycoon;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 30/04/16.
 */
public class AnimalListTest {

    @Test
    public void getList(){
        AnimalList animalList = new AnimalList();

        ArrayList<Animal> list = animalList.getList();

        assertNotNull(list);
    }

    @Test
    public void getAnimal() {
        AnimalList animalList = new AnimalList();
        Animal tiger = new Animal("Tiger");

        animalList.add(tiger);

        Animal result = animalList.get(tiger);
        assertEquals(tiger, result);
    }

    @Test
    public void getListSize(){
        AnimalList animalList = new AnimalList();
        Animal tiger = new Animal("Tiger");
        Animal penguin = new Animal("Penguin");

        animalList.add(tiger);
        animalList.add(penguin);
        assertEquals(2, animalList.getSize());
    }

}
