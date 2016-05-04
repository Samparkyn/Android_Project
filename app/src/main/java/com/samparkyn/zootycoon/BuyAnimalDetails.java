package com.samparkyn.zootycoon;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
    Button toEnclosures;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_animal_details);
        Log.d("HelloZoo:", "BuyAnimalDetails.onCreate called");

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, animalListArray);

        ListView myList = (ListView) findViewById(R.id.buy_animal_list);
        myList.setAdapter(myAdapter);

        toEnclosures = (Button)findViewById(R.id.to_enclosures);
        toEnclosures.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(BuyAnimalDetails.this, ChooseEnclosureDetails.class));
            }
        });

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Zoo zoo = new Zoo();
                String animal = ((TextView) view).getText().toString();
               Animal newAnimal = new Animal(animal, 40);
                zoo.addAnimal(newAnimal);

//                Toast.makeText(getBaseContext(), animal, Toast.LENGTH_LONG).show();
//                startActivity(new Intent(BuyAnimalDetails.this, ChooseEnclosureDetails.class));

//                AnimatorSet pandaSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.move);
//                pandaSet.setTarget(mPanda);
//                pandaSet.start();

                ObjectAnimator pandaMove = ObjectAnimator.ofFloat(findViewById(R.id.panda), "x", 320);
                pandaMove.setDuration(3000);
                pandaMove.setRepeatCount(ValueAnimator.INFINITE);
                pandaMove.setRepeatMode(ValueAnimator.REVERSE);
                pandaMove.start();




            }
        });
    }





}
