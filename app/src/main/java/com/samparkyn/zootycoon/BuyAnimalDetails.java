package com.samparkyn.zootycoon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.samparkyn.zootycoon.R;

/**
 * Created by user on 02/05/16.
 */
public class BuyAnimalDetails extends AppCompatActivity {

   String[] animalListArray = {"Tiger", "Lion", "Leopard", "Penguin", "Red Panda", "Zebra"};
    ListView mAnimalListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_animal_details);
        Log.d("HelloZoo:", "BuyAnimalDetails.onCreate called");

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, animalListArray);

        ListView myList = (ListView) findViewById(R.id.buy_animal_list);
        myList.setAdapter(myAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Zoo zoo = new Zoo();
                String animal = ((TextView) view).getText().toString();
               Animal newAnimal = new Animal(animal);
                zoo.addAnimal(newAnimal);

                Toast.makeText(getBaseContext(), animal, Toast.LENGTH_LONG).show();
                startActivity(new Intent(BuyAnimalDetails.this, ChooseEnclosureDetails.class));


            }
        });
    }





}
