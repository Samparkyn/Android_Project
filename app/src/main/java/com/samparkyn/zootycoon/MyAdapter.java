package com.samparkyn.zootycoon;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by user on 02/05/16.
 */
public class MyAdapter extends ArrayAdapter<Enclosure> {

    private Context context;
    private int resource;
    private Enclosure[] objects;


    public MyAdapter(Context context, int resource, Enclosure[] objects) {
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
        yourAnimals.setText((CharSequence) objects[position].mAnimals);

        return row;
    }


}
