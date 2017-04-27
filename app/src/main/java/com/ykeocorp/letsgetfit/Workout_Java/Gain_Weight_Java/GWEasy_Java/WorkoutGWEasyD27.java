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

public class WorkoutGWEasyD27 extends AppCompatActivity {

    ListView GWED27;

    // components of the list on the screen
    int[] images = {R.drawable.sit_up, R.drawable.jackknife, R.drawable.plank, R.drawable.sideplank, R.drawable.wallsit,
            R.drawable.russiantwist, R.drawable.legraises};

    final String[] workouts = {"Sit-ups", "Jack Knife", "Plank", "Side Plank", "Wall Sits", "Russian Twist", "Leg Raises"};

    String[] repetition = {"4 sets, 25 reps (1-2 min rest)", "4 sets, 25 reps (1-2 min rest)", "2 for 1 min each (1-2 min rest)",
            "2 per side for 1 min each (1-2 min rest)", "2 for 1 min each (1-2 min rest)", "4 sets, 25 reps (1-2 min rest)",
            "2 sets (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gweasy_d27);

        GWED27 = (ListView) findViewById(R.id.GWED27);

        WorkoutGWEasyD27.CustomAdapter customAdapter = new WorkoutGWEasyD27.CustomAdapter();

        GWED27.setAdapter(customAdapter);
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