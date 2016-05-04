package com.samparkyn.zootycoon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 02/05/16.
 */
public class ViewZooDetails extends AppCompatActivity {

    TextView mIncomeView;
    TextView mAnimalView;
    TextView mHungerLevelView;
    ListView mYourEnclosures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_zoo_details);
        Log.d("HelloZoo:", "ViewZooDetails.onCreate called");

        Animal animalArray[] = new Animal[]{
                new Animal("Tiger", 30, new EatZebraBehaviour()),
                new Animal("Lion", 50),
                new Animal("Leopard", 100),
                new Animal("Penguin", 20),
                new Animal("Red Panda", 70),
                new Animal("Zebra", 90)
        };


        Zoo zoo = new Zoo();
        zoo.addAnimal(animalArray[0]);
        zoo.addAnimal(animalArray[1]);
        zoo.addAnimal(animalArray[2]);
        zoo.addAnimal(animalArray[3]);
        zoo.addAnimal(animalArray[4]);
        zoo.addAnimal(animalArray[5]);


        mIncomeView = (TextView)findViewById(R.id.income_view);
        mAnimalView = (TextView)findViewById(R.id.animals_view);
        mHungerLevelView = (TextView)findViewById(R.id.animal_hunger);
        mYourEnclosures = (ListView)findViewById(R.id.view_your_enclosures);



        mIncomeView.setText(Integer.toString(zoo.getIncome()));
        mAnimalView.setText(Integer.toString(zoo.getCapacity()));
        mHungerLevelView.setText(Integer.toString(animalArray[0].getHungerLevel()));

        MyAdapter myAdapter = new MyAdapter(this, R.layout.view_zoo_animals_list, animalArray);
        ListView myList = (ListView) findViewById(R.id.view_your_enclosures);
        myList.setAdapter(myAdapter);


    }
}
