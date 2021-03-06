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

public class WorkoutLWHardD15 extends AppCompatActivity {

    ListView LWHD15;

    // components of the list on the screen
    int[] images = {R.drawable.barbellsquat, R.drawable.pushup, R.drawable.benchpress, R.drawable.dumbbellshoulderpress,
            R.drawable.barbelllunge, R.drawable.latspulldown, R.drawable.latspulldown, R.drawable.pushup,
            R.drawable.pushup, R.drawable.pushup, R.drawable.pushup};

    final String[] workouts = {"Burpee", "Push Up", "Split Jump", "Standing Dumbbell Press", "Dumbbell Lunge and Curl",
            "Dumbbell V-Sit Cross Jab", "Dumbbell Jump Squat", "Superman Push Up", "Tiger-Bend Push Up", "Typewriter Push Up",
            "Clapping Push Up"};

    String[] repetition = {"3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)",
            "3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)",
            "3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)",
            "3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lwhard_d15);

        LWHD15 = (ListView) findViewById(R.id.LWHD15);

        WorkoutLWHardD15.CustomAdapter customAdapter = new WorkoutLWHardD15.CustomAdapter();

        LWHD15.setAdapter(customAdapter);
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
