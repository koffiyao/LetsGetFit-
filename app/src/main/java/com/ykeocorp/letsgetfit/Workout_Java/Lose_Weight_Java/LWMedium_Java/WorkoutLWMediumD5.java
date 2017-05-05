package com.ykeocorp.letsgetfit.Workout_Java.Lose_Weight_Java.LWMedium_Java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.ykeocorp.letsgetfit.R;

public class WorkoutLWMediumD5 extends AppCompatActivity {

    ListView LWM;

    // components of the list on the screen
    int[] images = {R.drawable.barbellsquat, R.drawable.lyinglegcurls, R.drawable.benchpress, R.drawable.dumbbellfly,
            R.drawable.pullup, R.drawable.deadlift};

    final String[] workouts = {"Barbell Squats", "Lyin Leg Curls", "Bench Press", "Dumbbell Fly", "Pull Up", "Deadlift"};

    String[] repetition = {"4 sets, 10 reps (1-2 min rest)", "4 sets, 10 reps (1-2 min rest)", "4 sets, 10 reps (1-2 min rest)",
            "4 sets, 10 reps (1-2 min rest)", "4 sets, 10 reps (1-2 min rest)", "4 sets, 10 reps (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lwmedium_d1);

        LWM = (ListView) findViewById(R.id.LWM1);

        CustomAdapter customAdapter = new CustomAdapter();

        LWM.setAdapter(customAdapter);
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
