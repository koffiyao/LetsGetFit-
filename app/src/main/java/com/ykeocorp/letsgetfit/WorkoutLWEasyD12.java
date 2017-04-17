package com.ykeocorp.letsgetfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WorkoutLWEasyD12 extends AppCompatActivity {

    ListView LWED12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lweasy_d12);

        LWED12 = (ListView) findViewById(R.id.LWED12);

        // components of the list on the screen
        final String[] workouts = {"Barbell Squats:\n3 sets of 10 reps", "Deadlifts:\n3 sets of 10 reps", "Bench Press:\n3 sets of 10 reps", "Push Ups:\n3 sets of 6-10 reps", "Lats Pulldown:\n3 sets of 10 reps"};

        ArrayAdapter<String> easyAdapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1, workouts);

        LWED12.setAdapter(easyAdapter);
    }
}
