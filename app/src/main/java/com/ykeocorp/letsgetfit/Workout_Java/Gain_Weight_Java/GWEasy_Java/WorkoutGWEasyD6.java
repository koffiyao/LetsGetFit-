package com.ykeocorp.letsgetfit.Workout_Java.Gain_Weight_Java.GWEasy_Java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.ykeocorp.letsgetfit.R;

public class WorkoutGWEasyD6 extends AppCompatActivity {

    ListView GWED6;

    // components of the list on the screen
    int[] images = {R.drawable.crunch, R.drawable.plank, R.drawable.sideplank, R.drawable.flutterkick,
            R.drawable.flutterkick, R.drawable.jackknife, R.drawable.legraises};

    final String[] workouts = {"Crunch", "Plank", "Side Plank", "Capital ABC", "Lower abc", "Jack Knife", "Leg Raises"};

    String[] repetition = {"2 sets, 25 reps (1-2 min rest)", "2 for 30 sec each (1-2 min rest)",
            "1 on each side for 30 sec each (1-2 min rest)", "1 sets (1-2 min rest)", "1 set (1-2 min rest)",
            "2 sets, 25 reps (1-2 min rest)", "1 set (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gweasy_d6);

        GWED6 = (ListView) findViewById(R.id.GWED6);

        WorkoutGWEasyD6.CustomAdapter customAdapter = new WorkoutGWEasyD6.CustomAdapter();

        GWED6.setAdapter(customAdapter);
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