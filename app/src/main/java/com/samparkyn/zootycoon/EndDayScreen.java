package com.samparkyn.zootycoon;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 03/05/16.
 */
public class EndDayScreen extends AppCompatActivity {
    TextView mMessage;
    ImageView mTiger;
    ImageView mPenguin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_day_screen);
        Log.d("HelloZoo:", "ViewZooDetails.onCreate called");

        Animal animalArray[] = new Animal[]{
                new Animal("Tiger", 30),
                new Animal("Lion", 50),
                new Animal("Leopard", 100),
                new Animal("Penguin", 20),
                new Animal("Red Panda", 70),
                new Animal("Zebra", 90)
        };

        Zoo zoo = new Zoo();
        for (int i = 0; i < animalArray.length; i++) {
            zoo.addAnimal(animalArray[i]);
        }

        mMessage = (TextView)findViewById(R.id.end_day_message);
        mTiger = (ImageView)findViewById(R.id.tiger);


        mMessage.setText(zoo.endDay());


        AnimatorSet tigerSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.move);
        tigerSet.setTarget(mTiger);
        tigerSet.start();

        ObjectAnimator tigerMove = ObjectAnimator.ofFloat(findViewById(R.id.tiger), "x", 320);
        tigerMove.setDuration(3000);
        tigerMove.setRepeatCount(ValueAnimator.INFINITE);
        tigerMove.setRepeatMode(ValueAnimator.REVERSE);
        tigerMove.start();

        ObjectAnimator penguinMove = ObjectAnimator.ofFloat(findViewById(R.id.penguin), "x", 450);
        penguinMove.setDuration(3000);
        penguinMove.setRepeatCount(ValueAnimator.INFINITE);
        penguinMove.setRepeatMode(ValueAnimator.REVERSE);
        penguinMove.start();

        ObjectAnimator penguinMoveDown = ObjectAnimator.ofFloat(findViewById(R.id.penguin), "y", 350);
        penguinMoveDown.setDuration(3000);
        penguinMoveDown.setRepeatCount(ValueAnimator.INFINITE);
        penguinMoveDown.setRepeatMode(ValueAnimator.REVERSE);
        penguinMoveDown.start();

    }


}
