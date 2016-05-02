package com.samparkyn.zootycoon;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by user on 29/04/16.
 */
public class Zoo implements Serializable {
    private int mIncome;
    private int mCapacity;
    private ArrayList<Enclosure> mEnclosures;
    private ArrayList<Animal> mAnimals;

    public Zoo(){
        mCapacity = 10;
        mEnclosures = new ArrayList<Enclosure>();
        mAnimals = new ArrayList<Animal>();

    }

    public void addEnclosure(Enclosure enclosure){
        mEnclosures.add(enclosure);
    }

    public void addAnimal(Animal animal){
        mAnimals.add(animal);
    }

    public int getCapacity(){
        return mAnimals.size();
    }

    public int getEnclosures(){
        return mEnclosures.size();
    }

    public void createAnimalList(){
        String[]  animalListArray = {"Tiger", "Lion", "Bear", "Penguin", "Red Panda", "Zebra"};
        for (int i = 0; i < animalListArray.length ; i++) {
             Animal newAnimal = new Animal(animalListArray[i]);

        }
    }

    public int feedAnimal(Animal animal){
        animal = new Animal();
       int hunger = animal.getHungerLevel();
        if(hunger < 100) {
            hunger += 10;
            return hunger;
        }

        return hunger;

    }

    public int getIncome(){
        for (int i = 0; i < mAnimals.size() ; i++) {
            mIncome += 25;
        }
        return mIncome;
    }
}
