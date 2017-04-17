package com.ykeocorp.letsgetfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WorkoutLWEasyD6 extends AppCompatActivity {

    ListView LWED6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lweasy_d6);

        LWED6 = (ListView) findViewById(R.id.LWED6);

        // components of the list on the screen
        final String[] workouts = {"Sit-ups:\n3 sets of 10 reps", "Crunch:\n3 sets of 10 reps", "Side Crunch:\n2 sets of 10 reps on each side", "Flutter Kick:\n2 sets of 25 reps", "Plank:\n2 at 30 sec each"};

        ArrayAdapter<String> easyAdapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1, workouts);

        LWED6.setAdapter(easyAdapter);
    }
}
