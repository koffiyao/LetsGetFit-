package com.ykeocorp.letsgetfit.Workout_Java.Gain_Weight_Java.GWHard_Java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.ykeocorp.letsgetfit.R;

public class WorkoutGWHardD17 extends AppCompatActivity {

    ListView GWHD17;

    // components of the list on the screen
    int[] images = {R.drawable.barbellsquat, R.drawable.deadlift,
            R.drawable.inclinelegpress, R.drawable.romaniandeadlift};

    final String[] workouts = {"Barbell Squats", "Deadlifts", "Incline Leg Press",
            "Romanian Deadlift"};

    String[] repetition = {"4 sets, 5 reps (3 min rest)", "4 sets, 5 reps (3 min rest)",
            "4 sets, 5 reps (3 min rest)", "4 sets, 5 reps (3 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gwhard_d17);

        GWHD17 = (ListView) findViewById(R.id.GWHD17);

        WorkoutGWHardD17.CustomAdapter customAdapter = new WorkoutGWHardD17.CustomAdapter();

        GWHD17.setAdapter(customAdapter);
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
