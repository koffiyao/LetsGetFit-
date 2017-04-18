package com.ykeocorp.letsgetfit.LWEasy_Java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.ykeocorp.letsgetfit.R;

public class WorkoutLWEasyD3 extends AppCompatActivity {

    ListView LWED3;

    // components of the list on the screen
    int[] images = {R.drawable.squat, R.drawable.deadlift, R.drawable.benchpress,
            R.drawable.pushup, R.drawable.latspulldown};

    final String[] workouts = {"Barbell Squats", "Deadlifts", "Bench Press", "Push Ups", "Lats Pulldown"};

    String[] repetition = {"3 sets, 10 reps (1-2 min rest)", "3 sets, 10 reps (1-2 min rest)", "3 sets, 10 reps (1-2 min rest)",
            "3 sets, 6-10 reps (1-2 min rest)", "3 sets, 10 reps (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lweasy_d3);

        LWED3 = (ListView) findViewById(R.id.LWED3);

        WorkoutLWEasyD3.CustomAdapter customAdapter = new WorkoutLWEasyD3.CustomAdapter();

        LWED3.setAdapter(customAdapter);
    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.custom_layout, null);

            ImageView imageView = (ImageView)convertView.findViewById(R.id.imageView);
            TextView textView_name = (TextView)convertView.findViewById(R.id.textView_name);
            TextView textView_reps = (TextView)convertView.findViewById(R.id.textView_reps);

            imageView.setImageResource(images[position]);
            textView_name.setText(workouts[position]);
            textView_reps.setText(repetition[position]);

            return convertView;
        }
    }
}