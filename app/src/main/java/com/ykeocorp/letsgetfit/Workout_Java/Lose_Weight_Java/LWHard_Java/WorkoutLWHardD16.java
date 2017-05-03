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

public class WorkoutLWHardD16 extends AppCompatActivity {

    ListView LWHD16;

    // components of the list on the screen
    int[] images = {R.drawable.barbelllunge, R.drawable.barbellsquat, R.drawable.romaniandeadlift, R.drawable.barbellsquat,
            R.drawable.barbellsquat, R.drawable.mountainclimbers, R.drawable.barbellsquat, R.drawable.barbellsquat};

    final String[] workouts = {"Barbell Walking Lunge", "Single Leg Squat to Box", "Romanian Deadlift", "Front Barbell Squat",
            "Dumbbell Hack Squat", "Mountain Climbers", "90-Degree Jump Squat Twist", "Air Squat"};

    String[] repetition = {"3 sets, 15 reps (1-2 min rest)", "3 sets, 10 reps (1-2 min rest)", "3 sets, 15 reps (1-2 min rest)",
            "3 sets, 15 reps (1-2 min rest)", "3 sets, 15 reps (1-2 min rest)", "30 sec (No rest)",
            "30 sec (No rest)", "30 sec (No rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lwhard_d16);

        LWHD16 = (ListView) findViewById(R.id.LWHD16);

        WorkoutLWHardD16.CustomAdapter customAdapter = new WorkoutLWHardD16.CustomAdapter();

        LWHD16.setAdapter(customAdapter);
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
