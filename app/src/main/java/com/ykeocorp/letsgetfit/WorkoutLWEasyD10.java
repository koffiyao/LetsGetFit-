package com.ykeocorp.letsgetfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WorkoutLWEasyD10 extends AppCompatActivity {

    ListView LWED10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lweasy_d10);

        LWED10 = (ListView) findViewById(R.id.LWED10);

        // components of the list on the screen
        final String[] workouts = {"Barbell Squats:\n3 sets of 10 reps", "Deadlifts:\n3 sets of 10 reps", "Bench Press:\n3 sets of 10 reps", "Push Ups:\n3 sets of 6-10 reps", "Lats Pulldown:\n3 sets of 10 reps"};

        ArrayAdapter<String> easyAdapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1, workouts);

        LWED10.setAdapter(easyAdapter);
    }
}