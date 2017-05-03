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

public class WorkoutLWHardD10 extends AppCompatActivity {

    ListView LWHD10;

    // components of the list on the screen
    int[] images = {R.drawable.pushup, R.drawable.dumbbellfly, R.drawable.benchpress, R.drawable.pushup,
            R.drawable.dumbbellfly, R.drawable.benchpress, R.drawable.latspulldown, R.drawable.pushup, R.drawable.tricepdip};

    final String[] workouts = {"Weighted Push Up", "Dumbbell Fly", "Narrow Grip Dumbbell Press", "Bar Throw and Press",
            "Incline Dumbbell Fly", "Narrow Grip Bench Press", "V-Sit Dumbbell Triceps Extension", "Diamond Push Up", "Weighted Dip"};

    String[] repetition = {"4 sets, 12 reps (1-2 min rest)", "4 sets, 10 reps (30 sec rest)", "4 sets, 10 reps (30 sec rest)",
            "4 sets, 12 reps (1 min rest)", "4 sets, 10 reps (30 sec rest)", "4 sets, 10 reps (30 sec rest)",
            "4 sets, 10 reps (30 sec rest)", "4 sets, 15 reps (30 sec rest)", "3 sets, 6 reps (1 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lwhard_d10);

        LWHD10 = (ListView) findViewById(R.id.LWHD10);

        WorkoutLWHardD10.CustomAdapter customAdapter = new WorkoutLWHardD10.CustomAdapter();

        LWHD10.setAdapter(customAdapter);
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
