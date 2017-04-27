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

public class WorkoutGWMediumD6 extends AppCompatActivity {

    ListView GWMD6;

    // components of the list on the screen
    int[] images = {R.drawable.sit_up, R.drawable.crunch, R.drawable.sidecrunch, R.drawable.plank, R.drawable.russiantwist,
            R.drawable.jackknife, R.drawable.legraises};

    final String[] workouts = {"Sit-ups", "Crunch", "Side Crunch", "Plank", "Russian Twist", "Jack Knife", "Leg Raises"};

    String[] repetition = {"2 sets, 25 reps (1-2 min rest)", "3 sets, 25 reps (1-2 min rest)", "2 sets, 25 reps (1-2 min rest)",
            "2 for 1 min each (1-2 min rest)", "2 sets, 25 reps (1-2 min rest)", "2 sets, 25 reps (1-2 min rest)",
            "1 set (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gwmedium_d6);

        GWMD6 = (ListView) findViewById(R.id.GWMD6);

        WorkoutGWMediumD6.CustomAdapter customAdapter = new WorkoutGWMediumD6.CustomAdapter();

        GWMD6.setAdapter(customAdapter);
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
