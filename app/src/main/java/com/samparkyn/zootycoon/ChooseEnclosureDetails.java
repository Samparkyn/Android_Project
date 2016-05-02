package com.samparkyn.zootycoon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 02/05/16.
 */
public class ChooseEnclosureDetails extends AppCompatActivity {

    String[] enclosureListArray = {"Tigers", "Lions", "Leopards", "Penguins", "Red Pandas", "Zebras"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_enclosure_details);
        Log.d("HelloZoo:", "ChooseEnclosureDetails.onCreate called");

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, enclosureListArray);

        ListView myList= (ListView) findViewById(R.id.choose_enclosure);
        myList.setAdapter(myAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String enclosure = ((TextView) view).getText().toString();

                Toast.makeText(getBaseContext(), "You added your animal to: " + enclosure, Toast.LENGTH_LONG).show();
                startActivity(new Intent(ChooseEnclosureDetails.this, MainActivity.class));


            }
        });


    }

}
