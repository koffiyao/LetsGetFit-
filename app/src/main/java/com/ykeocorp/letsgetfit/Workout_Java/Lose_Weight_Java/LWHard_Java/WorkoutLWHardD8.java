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

public class WorkoutLWHardD8 extends AppCompatActivity {

    ListView LWHD8;

    // components of the list on the screen
    int[] images = {R.drawable.pushup, R.drawable.pushup, R.drawable.pushup, R.drawable.tricepdip,
            R.drawable.latspulldown, R.drawable.latspulldown, R.drawable.latspulldown};

    final String[] workouts = {"Push Up", "Diamond Push Up", "Wide Push Up", "Dips", "Bench Dips",
            "Wide Stance Jump Squat", "Tuck Jump"};

    String[] repetition = {"4 sets, 10 reps (30 sec rest)", "4 sets, 10 reps (30 sec rest)", "4 sets, 10 reps (30 sec rest)",
            "4 sets, 10 reps (30 sec rest)", "4 sets, 10 reps (30 sec rest)", "4 sets, 10 reps (30 sec rest)",
            "4 sets, 10 reps (30 sec rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lwhard_d8);

        LWHD8 = (ListView) findViewById(R.id.LWHD8);

        WorkoutLWHardD8.CustomAdapter customAdapter = new WorkoutLWHardD8.CustomAdapter();

        LWHD8.setAdapter(customAdapter);
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
