package com.ykeocorp.letsgetfit.Workout_Java.Gain_Weight_Java.GWEasy_Java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.app.Activity;

import com.google.android.youtube.player.YouTubeStandalonePlayer;
import com.ykeocorp.letsgetfit.Config;
import com.ykeocorp.letsgetfit.R;
import com.ykeocorp.letsgetfit.Workout_Java.WorkoutActivity;

public class WorkoutGWEasyD1 extends AppCompatActivity {

    ListView GWED1;

    // components of the list on the screen
    int[] images = {R.drawable.barbellsquat, R.drawable.deadlift,
            R.drawable.standingcalfraises, R.drawable.benchpress, R.drawable.pushup,
            R.drawable.pullup, R.drawable.latspulldown};

    final String[] workouts = {"Barbell Squats", "Deadlifts", "Standing Calf Raises",
            "Bench Press", "Push Ups", "Pull Ups", "Lats Pulldown"};

    String[] repetition = {"3 sets, 10 reps (1-2 min rest)", "3 sets, 10 reps (1-2 min rest)",
            "3 sets, 10 reps (1-2 min rest)", "3 sets, 10 reps (1-2 min rest)",
            "3 sets, 6-10 reps (1-2 min rest)", "3 sets, 1-3 reps (1-2 min rest)",
            "3 sets, 10 reps (1-2 min rest)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gweasy_d1);

        GWED1 = (ListView) findViewById(R.id.GWED1);

        CustomAdapter customAdapter = new CustomAdapter();

        GWED1.setAdapter(customAdapter);
/*
        GWED1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick (AdapterView < ? > parent, View view, int position, long id){
                if (position == 0) {
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(this.resolveActivity(), Config.YOUTUBE_API_KEY, "j5inWlsPomc", 0, true, true);
                    startActivity(intent);
                }
            }
        }
        */
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