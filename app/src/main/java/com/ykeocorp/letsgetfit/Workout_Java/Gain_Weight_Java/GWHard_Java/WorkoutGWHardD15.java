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

public class WorkoutGWHardD15 extends AppCompatActivity {

    ListView GWHD15;

    // components of the list on the screen
    int[] images = {R.drawable.pullup, R.drawable.seatedrow,
            R.drawable.widegriplatpulldown, R.drawable.onearmdumbbellrow, R.drawable.pushup,
            R.drawable.standingcablecurl};

    final String[] workouts = {"Pull Up", "Seated Row", "Wide-Grip Lats Pulldown",
            "One Arm Dumbbell Row", "Dumbbell Curl", "Standing Cable Curl"};

    String[] repetition = {"5 sets, 10 reps (1-2 min rest)", "5 sets, 10 reps (1-2 min rest)",
            "5 sets, 10 reps (1-2 min rest)", "5 sets, 10 reps (1-2 min rest)",
            "5 sets, 10 reps (1-2 min rest)", "5 sets, 10 reps (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gwhard_d15);

        GWHD15 = (ListView) findViewById(R.id.GWHD15);

        WorkoutGWHardD15.CustomAdapter customAdapter = new WorkoutGWHardD15.CustomAdapter();

        GWHD15.setAdapter(customAdapter);
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
