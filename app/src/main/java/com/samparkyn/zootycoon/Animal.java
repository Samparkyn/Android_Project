package com.samparkyn.zootycoon;

/**
 * Created by user on 29/04/16.
 */
public class Animal {
    public String mSpecies;
    public int mHungerLevel;
    private int mExoticLevel;
    private IRampage mRampage;

    public Animal(){
        super();

    }

    public  Animal(String species){
        super();
        this.mSpecies = species;
    }

    public Animal(String species, int hunger){
        super();
        this.mSpecies = species;
        this.mHungerLevel = hunger;

    }

    public Animal(String species, int hunger, IRampage rampage){
        super();
        this.mSpecies = species;
        this.mHungerLevel = hunger;
        this.mRampage = rampage;
    }

    public String getSpecies() {
        return mSpecies;
    }

    public int getHungerLevel(){
        return mHungerLevel;
    }

    public void rampage(){
        mRampage.engage();
    }



}
