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

public class WorkoutLWHardD3 extends AppCompatActivity {

    ListView LWHD3;

    // components of the list on the screen
    int[] images = {R.drawable.barbellsquat, R.drawable.deadlift, R.drawable.benchpress, R.drawable.pushup, R.drawable.latspulldown,
            R.drawable.latspulldown, R.drawable.latspulldown, R.drawable.latspulldown, R.drawable.latspulldown,
            R.drawable.latspulldown, R.drawable.latspulldown};

    final String[] workouts = {"Incline Dumbbell Fly", "Decline Push Up", "Reverse Tricep Bench Press", "Decline Dumbbell Fly",
            "Clapping Push Up", "Dumbbell One-Arm Tricep Extension", "Weighted Dip", "Body Tricep Press",
            "Skullcrusher", "Tricep Plank Extension", "V-sit Lying Ball Throw"};

    String[] repetition = {"4 sets, 12 reps (30 sec rest)", "4 sets, 12 reps (30 sec rest)", "4 sets, 12 reps (1-2 min rest)",
            "4 sets, 12 reps (30 sec rest)", "4 sets, 12 reps (30 sec rest)", "4 sets, 15 reps (30-60 sec rest)",
            "5 sets, 8 reps (30 sec rest)", "4 sets, 12 reps (30 sec rest)", "4 sets, 12 reps (1-2 min rest)",
            "4 sets, 15 reps (1 min rest)", "5 sets, 20 reps (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lwhard_d3);

        LWHD3 = (ListView) findViewById(R.id.LWHD3);

        WorkoutLWHardD3.CustomAdapter customAdapter = new WorkoutLWHardD3.CustomAdapter();

        LWHD3.setAdapter(customAdapter);
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
