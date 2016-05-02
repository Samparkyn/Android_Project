package com.samparkyn.zootycoon;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 29/04/16.
 */
public class EnclosureTest {

    @Test
    public void testEnclosureCapacity(){
        Enclosure enclosure = new Enclosure();
        Animal tiger = new Animal("Tiger");
        Animal penguin = new Animal("Penguin");
        enclosure.addAnimal(tiger);
        enclosure.addAnimal(penguin);
        assertEquals(2, enclosure.getCapacity());
    }
}
