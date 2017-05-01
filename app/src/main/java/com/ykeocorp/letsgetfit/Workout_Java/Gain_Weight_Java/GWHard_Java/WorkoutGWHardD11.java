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

public class WorkoutGWHardD11 extends AppCompatActivity {

    ListView GWHD11;

    // components of the list on the screen
    int[] images = {R.drawable.bentoverbarbellrow, R.drawable.pullup,
            R.drawable.barbellcurl, R.drawable.barbellshrug};

    final String[] workouts = {"Bent Over Barbell Row", "Weighted Pull Up", "Barbell Curl",
            "Barbell Shrug"};

    String[] repetition = {"5 sets, 4 reps (3 min rest)", "5 sets, 4 reps (3 min rest)",
            "5 sets, 4 reps (3 min rest)", "5 sets, 4 reps (3 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gwhard_d11);

        GWHD11 = (ListView) findViewById(R.id.GWHD11);

        WorkoutGWHardD11.CustomAdapter customAdapter = new WorkoutGWHardD11.CustomAdapter();

        GWHD11.setAdapter(customAdapter);
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
