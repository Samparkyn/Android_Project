package com.samparkyn.zootycoon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 02/05/16.
 */
public class ViewZooDetails extends AppCompatActivity {

    TextView mIncomeView;
    TextView mAnimalView;
    TextView mHungerLevelView;
    ListView mYourEnclosures;
    Object[] enclosureListArray = {"Tigers", "Lions", "Leopards", "Penguins", "Red Pandas", "Zebras"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_zoo_details);
        Log.d("HelloZoo:", "ViewZooDetails.onCreate called");



        mIncomeView = (TextView)findViewById(R.id.income_view);
        mAnimalView = (TextView)findViewById(R.id.animals_view);
        mHungerLevelView = (TextView)findViewById(R.id.hunger_level_view);
        mYourEnclosures = (ListView)findViewById(R.id.view_your_enclosures);


        Zoo zoo = new Zoo();
        Animal tiger = new Animal("Tiger");
        zoo.addAnimal(tiger);
        zoo.addAnimal(tiger);
        mIncomeView.setText(Integer.toString(zoo.getIncome()));
        mAnimalView.setText(Integer.toString(zoo.getCapacity()));
        if(tiger.getHungerLevel() < 30) {
            mHungerLevelView.setText(Integer.toString(tiger.getHungerLevel()));
        }

        MyAdapter myAdapter = new MyAdapter(this, R.layout.view_zoo_details, );
        ListView myList = (ListView) findViewById(R.id.view_your_enclosures);
        myList.setAdapter(myAdapter);

//        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, enclosureListArray);
//
//        ListView myList= (ListView) findViewById(R.id.view_your_enclosures);
//        myList.setAdapter(myAdapter);

    }
}
