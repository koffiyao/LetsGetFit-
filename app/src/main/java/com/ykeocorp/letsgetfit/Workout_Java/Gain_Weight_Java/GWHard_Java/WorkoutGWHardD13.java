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

public class WorkoutGWHardD13 extends AppCompatActivity {

    ListView GWHD13;

    // components of the list on the screen
    int[] images = {R.drawable.barbellsquat, R.drawable.legextensions,
            R.drawable.lyinglegcurls, R.drawable.hyperextension, R.drawable.barbelllunge,
            R.drawable.inclinelegpress, R.drawable.seatedcalfraise, R.drawable.latspulldown};

    final String[] workouts = {"Barbell Squats", "Leg Extensions", "Lying Leg Curl",
            "Hyperextension", "Barbell Lunge", "Incline Leg Press", "Seated Calf Raise",
            "Calf Press"};

    String[] repetition = {"5 sets, 10 reps (1-2 min rest)", "4 sets, 10 reps (no rest)",
            "4 sets, 10 reps (1-2 min rest)", "4 sets, 10 reps (1-2 min rest)",
            "2 sets, 20 reps (no rest)", "2 sets, 20 reps (1-2 min rest)",
            "5 sets, 10 reps (no rest)", "5 sets, 10 reps (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gwhard_d13);

        GWHD13 = (ListView) findViewById(R.id.GWHD13);

        WorkoutGWHardD13.CustomAdapter customAdapter = new WorkoutGWHardD13.CustomAdapter();

        GWHD13.setAdapter(customAdapter);
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
