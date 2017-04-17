package com.ykeocorp.letsgetfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WorkoutLWEasyD27 extends AppCompatActivity {

    ListView LWED27;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lweasy_d27);
        LWED27 = (ListView) findViewById(R.id.LWED27);

        // components of the list on the screen
        final String[] workouts = {"Sit-ups:\n2 sets of 25 reps", "Plank:\n2 at 1 min each", "Russian Twist:\n2 sets of 25 reps", "Jack Knife:\n2 sets of 25 reps", "Leg Raises:\n2 sets"};

        ArrayAdapter<String> easyAdapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1, workouts);

        LWED27.setAdapter(easyAdapter);
    }
}
