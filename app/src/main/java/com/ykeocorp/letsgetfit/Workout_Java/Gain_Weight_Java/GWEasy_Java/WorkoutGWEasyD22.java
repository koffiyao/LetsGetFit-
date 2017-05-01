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

public class WorkoutGWEasyD22 extends AppCompatActivity {

    ListView GWED22;

    // components of the list on the screen
    int[] images = {R.drawable.barbellsquat, R.drawable.standingcalfraises, R.drawable.benchpress, R.drawable.pushup,
            R.drawable.pullup, R.drawable.latspulldown, R.drawable.tricepspushdown, R.drawable.barbellcurl};

    final String[] workouts = {"Barbell Squats", "Standing Calf Raises", "Bench Press", "Push Ups", "Pull Ups", "Lats Pulldown",
            "Triceps Rope Pushdown", "Biceps Curl"};

    String[] repetition = {"3 sets, 10 reps (1-2 min rest)", "3 sets, 15 reps (1-2 min rest)", "3 sets, 10 reps (1-2 min rest)",
            "3 sets, 10-15 reps (1-2 min rest)", "3 sets, 7-10 reps (1-2 min rest)", "3 sets, 10 reps (1-2 min rest)",
            "3 sets, 10 reps (1-2 min rest)", "3 sets, 10 reps (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gweasy_d22);

        GWED22 = (ListView) findViewById(R.id.GWED22);

        WorkoutGWEasyD22.CustomAdapter customAdapter = new WorkoutGWEasyD22.CustomAdapter();

        GWED22.setAdapter(customAdapter);
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