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

public class WorkoutGWHardD22 extends AppCompatActivity {

    ListView GWHD22;

    // components of the list on the screen
    int[] images = {R.drawable.benchpress, R.drawable.inclinebenchpress,
            R.drawable.dumbbellfly, R.drawable.benchpress, R.drawable.ezbarskullcrusher,
            R.drawable.tricepspushdown};

    final String[] workouts = {"Dumbbell Bench Press", "Incline Bench Press", "Dumbbell Fly",
            "Cable Seated Lateral Raise", "EZ-Bar Skullcrusher", "Triceps Rope Pushdown"};

    String[] repetition = {"4 sets, 12 reps (1-2 min rest)", "4 sets, 12 reps (1-2 min rest)",
            "4 sets, 12 reps (1-2 min rest)", "4 sets, 12 reps (1-2 min rest)",
            "4 sets, 15 reps (superset)", "4 sets, 15 reps (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gwhard_d22);

        GWHD22 = (ListView) findViewById(R.id.GWHD22);

        WorkoutGWHardD22.CustomAdapter customAdapter = new WorkoutGWHardD22.CustomAdapter();

        GWHD22.setAdapter(customAdapter);
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
