package com.samparkyn.zootycoon;

import java.util.ArrayList;

/**
 * Created by user on 29/04/16.
 */
public class Enclosure {
    private int mCapacity;
    public ArrayList<Animal> mAnimals;

    public Enclosure() {
        mCapacity = 5;
        mAnimals = new ArrayList<Animal>();
    }


    public void addAnimal(Animal animal) {
        mAnimals.add(animal);
    }

    public int getCapacity() {
        return mAnimals.size();
    }
}



