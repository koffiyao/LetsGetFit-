package com.ykeocorp.letsgetfit.GWMedium_Java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.ykeocorp.letsgetfit.R;

public class WorkoutGWMediumD23 extends AppCompatActivity {

    ListView GWMD23;

    // components of the list on the screen
    int[] images = {R.drawable.barbellsquat, R.drawable.legpress, R.drawable.legextensions, R.drawable.lyinglegcurls,
            R.drawable.romaniandeadlift, R.drawable.standingcalfraises, R.drawable.seatedcalfraise};

    final String[] workouts = {"Barbell Squats", "Leg Press", "Leg Extensions", "Lying Leg Curl", "Romanian Deadlift",
            "Standing Calf Raises", "Seated Calf Raises"};

    String[] repetition = {"4 sets, 8 reps (1-2 min rest)", "4 sets, 8 reps (1-2 min rest)", "4 sets, 8 reps (1-2 min rest)",
            "4 sets, 8 reps (1-2 min rest)", "4 sets, 8 reps (1-2 min rest)", "4 sets, 10 reps (1-2 min rest)",
            "4 sets, 10 reps (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gwmedium_d23);

        GWMD23 = (ListView) findViewById(R.id.GWMD23);

        WorkoutGWMediumD23.CustomAdapter customAdapter = new WorkoutGWMediumD23.CustomAdapter();

        GWMD23.setAdapter(customAdapter);
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
