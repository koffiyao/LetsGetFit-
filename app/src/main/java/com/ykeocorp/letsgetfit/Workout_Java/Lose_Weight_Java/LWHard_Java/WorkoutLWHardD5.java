package com.ykeocorp.letsgetfit.Workout_Java.Lose_Weight_Java.LWHard_Java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.ykeocorp.letsgetfit.R;

public class WorkoutLWHardD5 extends AppCompatActivity {

    ListView LWHD5;

    // components of the list on the screen
    int[] images = {R.drawable.barbellsquat, R.drawable.deadlift, R.drawable.barbellcurl, R.drawable.pullup, R.drawable.latspulldown,
            R.drawable.barbellcurl, R.drawable.barbellcurl, R.drawable.barbellsquat, R.drawable.latspulldown,
            R.drawable.latspulldown, R.drawable.latspulldown};

    final String[] workouts = {"Renegade Row", "Deadlifts", "Barbell Row", "Around The World Pull Up", "Weighed Chin Up",
            "Wide Grip Barbell Curl", "Barbell Curl", "Narrow Grip Barbell Curl", "Cross-Body Hammer Curl",
            "One-Arm Plank Dumbbell Bicep Curl", "Overhead Cabel Curl"};

    String[] repetition = {"4 sets, 15 reps (1-2 min rest)", "4 sets, 10 reps (1 min rest)", "4 sets, 10 reps (1 min rest)",
            "4 sets, 8 reps (1-2 min rest)", "4 sets, 8 reps (1-2 min rest)", "3 sets, 10 reps (1 min rest)",
            "3 sets, 10 reps (1 min rest)", "3 sets, 10 reps (1 min rest)", "4 sets, 15 reps (1 min rest)",
            "4 sets, 15 reps (1 min rest)", "5 sets, 15 reps (1 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lwhard_d5);

        LWHD5 = (ListView) findViewById(R.id.LWHD5);

        WorkoutLWHardD5.CustomAdapter customAdapter = new WorkoutLWHardD5.CustomAdapter();

        LWHD5.setAdapter(customAdapter);
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
