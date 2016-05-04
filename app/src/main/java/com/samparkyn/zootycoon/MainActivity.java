package com.samparkyn.zootycoon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    Button mBuyAnimalButton;
    Button mViewZooButton;
    Button mEndDayButton;
    ListView mAnimalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBuyAnimalButton = (Button) findViewById(R.id.buy_animal_button);
        mViewZooButton = (Button) findViewById(R.id.view_zoo_button);
        mEndDayButton = (Button) findViewById(R.id.end_day_button);
        mAnimalList = (ListView) findViewById(R.id.buy_animal_list);

        mBuyAnimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BuyAnimalDetails.class));
            }
        });

        mViewZooButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ViewZooDetails.class));
            }
        });

        mEndDayButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, EndDayScreen.class));

            }
        });




    }

    public void moveAnimal(View view){
        ImageView image = (ImageView)findViewById(R.id.welcome_img);
        Animation moveAnimal = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        image.startAnimation(moveAnimal);
    }


}

