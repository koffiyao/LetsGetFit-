package com.ykeocorp.letsgetfit.Workout_Java.Gain_Weight_Java.GWMedium_Java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.ykeocorp.letsgetfit.R;

public class WorkoutGWMediumD8 extends AppCompatActivity {

    ListView GWMD8;

    // components of the list on the screen
    int[] images = {R.drawable.benchpress, R.drawable.inclinebenchpress, R.drawable.machinefly, R.drawable.tricepdip,
            R.drawable.narrowgripbenchpress, R.drawable.triceppulldown, R.drawable.militarypress, R.drawable.lateralraises};

    final String[] workouts = {"Bench Press", "Incline Bench Press", "Machine Fly", "Tricep Dips", "Bench Press Narrow Grip",
            "Triceps Pulldown", "Military Press", "Lateral Raise"};

    String[] repetition = {"4 sets, 8 reps (1-2 min rest)", "4 sets, 8 reps (1-2 min rest)", "4 sets, 8 reps (1-2 min rest)",
            "4 sets, 8 reps (1-2 min rest)", "4 sets, 8 reps (1-2 min rest)", "4 sets, 8 reps (1-2 min rest)",
            "4 sets, 8 reps (1-2 min rest)", "4 sets, 8 reps (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gwmedium_d8);

        GWMD8 = (ListView) findViewById(R.id.GWMD8);

        WorkoutGWMediumD8.CustomAdapter customAdapter = new WorkoutGWMediumD8.CustomAdapter();

        GWMD8.setAdapter(customAdapter);
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
