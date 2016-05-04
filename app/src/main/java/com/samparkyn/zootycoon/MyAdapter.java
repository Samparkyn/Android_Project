package com.samparkyn.zootycoon;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by user on 02/05/16.
 */
public class MyAdapter extends ArrayAdapter<Animal> {

    private Context context;
    private int resource;
    private Animal[] objects;


    public MyAdapter(Context context, int resource, Animal[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;


    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(resource, parent, false);

        TextView yourAnimals = (TextView) row.findViewById(R.id.your_animals);
        TextView hungerLevel = (TextView) row.findViewById(R.id.hunger_level);
        Button feedButton = (Button) row.findViewById(R.id.feed_button);

        yourAnimals.setText((CharSequence) objects[position].mSpecies);
        hungerLevel.setText(Integer.toString(objects[position].mHungerLevel));
        feedButton.setTag(feedButton);

        feedButton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                Toast.makeText(getContext(), "Animal Fed", Toast.LENGTH_SHORT).show();

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


                for (int i = 0; i < animalArray.length ; i++) {
                    zoo.addAnimal(animalArray[i]);
                    zoo.feedAnimal(animalArray[i]);
                    animalArray[i].getHungerLevel();
                }

            }
        });

        return row;
    }


}
