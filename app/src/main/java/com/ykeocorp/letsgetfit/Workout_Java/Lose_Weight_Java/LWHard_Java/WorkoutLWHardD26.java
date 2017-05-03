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

public class WorkoutLWHardD26 extends AppCompatActivity {

    ListView LWHD26;

    // components of the list on the screen
    int[] images = {R.drawable.pullup, R.drawable.pullup, R.drawable.latspulldown, R.drawable.romaniandeadliftwithdumbbell,
            R.drawable.latspulldown, R.drawable.barbellcurl, R.drawable.barbellcurl, R.drawable.barbellcurl,
            R.drawable.preachercurl, R.drawable.barbellcurl};

    final String[] workouts = {"Chin Up", "Wide Grip Pull Up", "Lat Pull Down", "Dumbbell Romanian Deadlift", "L-Sit Chin Up",
            "Seated Wide Grip Barbell Curl", "Seated Barbell Curl", "Seated Close Grip Barbell Curl",
            "Alternating Hammer Grip Preacher Curl", "Concentration Curl"};

    String[] repetition = {"3 sets, 12 reps (30 sec rest)", "3 sets, 12 reps (30 sec rest)", "4 sets, 10 reps (1 min rest)",
            "4 sets, 12 reps (30 sec rest)", "4 sets, 12 reps (30 sec rest)", "3 sets, 10 reps (30 sec rest)",
            "3 sets, 10 reps (30 sec rest)", "3 sets, 10 reps (30 sec rest)", "4 sets, 15 reps (1-2 min rest)",
            "4 sets, 5 reps (1 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lwhard_d26);

        LWHD26 = (ListView) findViewById(R.id.LWHD26);

        WorkoutLWHardD26.CustomAdapter customAdapter = new WorkoutLWHardD26.CustomAdapter();

        LWHD26.setAdapter(customAdapter);
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
