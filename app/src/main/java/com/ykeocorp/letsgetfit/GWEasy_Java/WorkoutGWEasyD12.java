package com.ykeocorp.letsgetfit.GWEasy_Java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.ykeocorp.letsgetfit.R;

public class WorkoutGWEasyD12 extends AppCompatActivity {

    ListView GWED12;

    // components of the list on the screen
    int[] images = {R.drawable.squat, R.drawable.deadlift, R.drawable.benchpress, R.drawable.pushup, R.drawable.latspulldown};

    final String[] workouts = {"Barbell Squats", "Calves Raises", "Bench Press", "Push Ups", "Pull Ups", "Lats Pulldown",
            "Triceps Rope Pushdown", "Biceps Curl"};

    String[] repetition = {"3 sets, 10 reps (1-2 min rest)", "3 sets, 15 reps (1-2 min rest)", "3 sets, 10 reps (1-2 min rest)",
            "3 sets, 8-12 reps (1-2 min rest)", "3 sets, 3-6 reps (1-2 min rest)", "3 sets, 10 reps (1-2 min rest)",
            "3 sets, 10 reps (1-2 min rest)", "3 sets, 10 reps (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gweasy_d12);

        GWED12 = (ListView) findViewById(R.id.GWED12);

        WorkoutGWEasyD12.CustomAdapter customAdapter = new WorkoutGWEasyD12.CustomAdapter();

        GWED12.setAdapter(customAdapter);
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