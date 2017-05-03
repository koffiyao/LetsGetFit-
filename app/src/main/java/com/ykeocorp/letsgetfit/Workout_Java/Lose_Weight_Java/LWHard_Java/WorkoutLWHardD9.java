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

public class WorkoutLWHardD9 extends AppCompatActivity {

    ListView LWHD9;

    // components of the list on the screen
    int[] images = {R.drawable.barbelllunge, R.drawable.barbellsquat, R.drawable.romaniandeadlift, R.drawable.barbellsquat,
            R.drawable.barbellsquat, R.drawable.latspulldown, R.drawable.latspulldown, R.drawable.barbellsquat};

    final String[] workouts = {"Lunge with Overhead Weight", "Barbell Squat", "Romanian Deadlift", "Dumbbell Jump Squat", "Jump Squat",
            "Kettlebell Thruster", "Burpees", "Dumbbell Squat Hold"};

    String[] repetition = {"4 sets, 12 reps (1-2 min rest)", "4 sets, 12 reps (1-2 min rest)", "4 sets, 12 reps (1-2 min rest)",
            "4 sets, 12 reps (30 sec rest)", "4 sets, 12 reps (30 sec rest)", "4 sets, 10 reps (30 sec rest)",
            "4 sets, 10 reps (30-60 sec rest)", "3 sets, for 1 min each (1 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lwhard_d9);

        LWHD9 = (ListView) findViewById(R.id.LWHD9);

        WorkoutLWHardD9.CustomAdapter customAdapter = new WorkoutLWHardD9.CustomAdapter();

        LWHD9.setAdapter(customAdapter);
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
