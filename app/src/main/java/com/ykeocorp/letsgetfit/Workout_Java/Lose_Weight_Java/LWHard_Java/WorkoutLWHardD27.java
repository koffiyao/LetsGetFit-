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

public class WorkoutLWHardD27 extends AppCompatActivity {

    ListView LWHD27;

    // components of the list on the screen
    int[] images = {R.drawable.barbellsquat, R.drawable.deadlift, R.drawable.benchpress, R.drawable.militarypress,
            R.drawable.bentoverbarbellrow, R.drawable.barbellshrug, R.drawable.pushup, R.drawable.pushup,
            R.drawable.pushup, R.drawable.latspulldown, R.drawable.latspulldown, R.drawable.latspulldown};

    final String[] workouts = {"Arnold Press", "Front Plate Raise", "Bent Over Rear Delt Raise", "Standing Barbell Military Press",
            "Dumbbell Upright Row", "Dumbbell Shrug", "Clapping Push Up", "Dive Bomber Push Up", "Superman Push Up", "Tuck Jump",
            "Burpee", "Hanging Leg Raise"};

    String[] repetition = {"3 sets, 15 reps (1 min rest)", "4 sets, 15 reps (30 sec rest)", "4 sets, 15 reps (30 sec rest)",
            "4 sets, 10 reps (1 min rest)", "4 sets, 15 reps (30 sec rest)", "4 sets, 15 reps (30 sec rest)",
            "3 sets, 10 reps (1-2 min rest)", "2 sets, 10 reps (30 sec rest)", "2 sets, 10 reps (30 sec rest)",
            "2 sets, 10 reps (30 sec rest)", "2 sets, 10 reps (30 sec rest)", "2 sets, 10 reps (30 sec rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lwhard_d27);

        LWHD27 = (ListView) findViewById(R.id.LWHD27);

        WorkoutLWHardD27.CustomAdapter customAdapter = new WorkoutLWHardD27.CustomAdapter();

        LWHD27.setAdapter(customAdapter);
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
