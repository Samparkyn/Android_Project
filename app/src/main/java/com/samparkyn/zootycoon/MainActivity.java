package com.samparkyn.zootycoon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    Button mBuyAnimalButton;
    Button mViewZooButton;
    ListView mAnimalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBuyAnimalButton = (Button) findViewById(R.id.buy_animal_button);
        mViewZooButton = (Button) findViewById(R.id.view_zoo_button);
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


    }


}

