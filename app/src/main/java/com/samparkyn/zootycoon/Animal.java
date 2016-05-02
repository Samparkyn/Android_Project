package com.samparkyn.zootycoon;

/**
 * Created by user on 29/04/16.
 */
public class Animal {
    private String mSpecies;
    private int mHungerLevel;
    private int mExoticLevel;
    private IRampage mRampage;

    public Animal(){
        mHungerLevel = 20;
    }

    public Animal(String species){
        this();
        mSpecies = species;

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
