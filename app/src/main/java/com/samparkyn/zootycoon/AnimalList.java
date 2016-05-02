package com.samparkyn.zootycoon;

import java.util.ArrayList;

/**
 * Created by user on 30/04/16.
 */
public class AnimalList {

    private ArrayList<Animal> mAnimals;

    public AnimalList(){
        mAnimals = new ArrayList<Animal>();
    }

    public AnimalList(ArrayList<Animal> animals){
        mAnimals = new ArrayList<Animal>(animals);
    }

    public ArrayList<Animal> getList() {
        return new ArrayList<Animal>(mAnimals);

    }

    public int getSize(){
        return mAnimals.size();
    }

    public void add(Animal animal)
    {
        mAnimals.add(animal);
    }

    public Animal get(Animal animal)
    {
        if (mAnimals.contains(animal))
        {
            int index = mAnimals.indexOf(animal);
            return mAnimals.get(index);
        }
        return null;
    }

    public Animal get(String species) {

        for (Animal animal : mAnimals)
        {
            if (animal.getSpecies().equals(species)) {

                return animal;
            }
        }

        return null;
    }
}
