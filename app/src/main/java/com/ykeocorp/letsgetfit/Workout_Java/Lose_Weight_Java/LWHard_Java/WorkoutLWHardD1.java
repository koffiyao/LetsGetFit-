package com.ykeocorp.letsgetfit.Workout_Java.Lose_Weight_Java.LWHard_Java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.preference.PreferenceManager;

import com.ykeocorp.letsgetfit.R;

public class WorkoutLWHardD1 extends AppCompatActivity {

    ListView LWHD1;

    // components of the list on the screen
    int[] images = {R.drawable.barbellsquat, R.drawable.pushup, R.drawable.benchpress, R.drawable.pushup,
            R.drawable.latspulldown, R.drawable.latspulldown, R.drawable.latspulldown, R.drawable.latspulldown,
            R.drawable.latspulldown, R.drawable.latspulldown, R.drawable.latspulldown};

    final String[] workouts = {"Burpee", "Push Up", "Split Jump", "Standing Dumbbell Press", "Dumbbell Lunge and Curl",
            "Dumbell V-Sit Cross Jab", "Dumbell Jump Squat", "Superman Push Up", "Tiger-Bend Push Up",
            "Typewriter Push Up", "Clapping Push Up"};

    String[] repetition = {"3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)",
            "3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)",
            "3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)",
            "3 sets, 15-25 reps (30 sec rest)", "3 sets, 15-25 reps (30 sec rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lwhard_d1);

        LWHD1 = (ListView) findViewById(R.id.LWHD1);

        WorkoutLWHardD1.CustomAdapter customAdapter = new WorkoutLWHardD1.CustomAdapter();

        LWHD1.setAdapter(customAdapter);
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
