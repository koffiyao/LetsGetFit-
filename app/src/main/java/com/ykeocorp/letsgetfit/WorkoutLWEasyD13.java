package com.ykeocorp.letsgetfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WorkoutLWEasyD13 extends AppCompatActivity {

    ListView LWED13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lweasy_d13);

        LWED13 = (ListView) findViewById(R.id.LWED13);

        // components of the list on the screen
        final String[] workouts = {"Bicycle Crunch:\n2 sets of 25 reps", "Side Crunch:\n2 sets of 25 reps on each side", "Capital ABC:\n1 set", "Lower Case abc:\n1 set", "Plank:\n2 at 1 min each"};

        ArrayAdapter<String> easyAdapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1, workouts);

        LWED13.setAdapter(easyAdapter);
    }
}
