package com.ykeocorp.letsgetfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WorkoutLWEasyD20 extends AppCompatActivity {

    ListView LWED20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lweasy_d20);

        LWED20 = (ListView) findViewById(R.id.LWED20);

        // components of the list on the screen
        final String[] workouts = {"Sit-ups:\n2 sets of 25 reps", "Jack Knife:\n2 sets of 10 reps", "Leg Raises:\n1 set", "Plank:\n2 at 1 min each", "Side Plank:\n1 on each side at 1 min each"};

        ArrayAdapter<String> easyAdapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1, workouts);

        LWED20.setAdapter(easyAdapter);
    }
}
