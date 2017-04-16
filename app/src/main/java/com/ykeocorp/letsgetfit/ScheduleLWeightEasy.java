package com.ykeocorp.letsgetfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ScheduleLWeightEasy extends AppCompatActivity {

    ListView easyListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_lweight_easy);

        easyListView = (ListView) findViewById(R.id.easyListView);
        final String[] days = {"Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6", "Day 7", "Day 8",
                "Day 9", "Day 10", "Day 11", "Day 12", "Day 13", "Day 14", "Day 15", "Day 16",
                "Day 17", "Day 18", "Day 19", "Day 20", "Day 21", "Day 22", "Day 23", "Day 24",
                "Day 25", "Day 26", "Day 27", "Day 28"};
        ArrayAdapter<String> easyAdapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item,
                android.R.id.text1,days);
        easyListView.setAdapter(easyAdapter);
        easyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(),WorkoutLWEasyD1.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD2.class);
                    startActivityForResult(intent, 1);
                }
                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD3.class);
                    startActivityForResult(intent, 2);
                }
                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD4.class);
                    startActivityForResult(intent, 3);
                }
                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD5.class);
                    startActivityForResult(intent, 4);
                }
                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD6.class);
                    startActivityForResult(intent, 5);
                }
                if (position == 6) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD7.class);
                    startActivityForResult(intent, 6);
                }
                if (position == 7) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD8.class);
                    startActivityForResult(intent, 7);
                }
                if (position == 8) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD9.class);
                    startActivityForResult(intent, 8);
                }
                if (position == 9) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD10.class);
                    startActivityForResult(intent, 9);
                }
                if (position == 10) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD11.class);
                    startActivityForResult(intent, 10);
                }
                if (position == 11) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD12.class);
                    startActivityForResult(intent, 11);
                }
                if (position == 12) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD13.class);
                    startActivityForResult(intent, 12);
                }
                if (position == 13) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD14.class);
                    startActivityForResult(intent, 13);
                }
                if (position == 14) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD15.class);
                    startActivityForResult(intent, 14);
                }
                if (position == 15) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD16.class);
                    startActivityForResult(intent, 15);
                }
                if (position == 16) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD17.class);
                    startActivityForResult(intent, 16);
                }
                if (position == 17) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD18.class);
                    startActivityForResult(intent, 17);
                }
                if (position == 18) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD19.class);
                    startActivityForResult(intent, 18);
                }
                if (position == 19) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD20.class);
                    startActivityForResult(intent, 19);
                }
                if (position == 20) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD21.class);
                    startActivityForResult(intent, 20);
                }
                if (position == 21) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD22.class);
                    startActivityForResult(intent, 21);
                }
                if (position == 22) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD23.class);
                    startActivityForResult(intent, 22);
                }
                if (position == 23) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD24.class);
                    startActivityForResult(intent, 23);
                }
                if (position == 24) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD25.class);
                    startActivityForResult(intent, 24);
                }
                if (position == 25) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD26.class);
                    startActivityForResult(intent, 25);
                }
                if (position == 26) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD27.class);
                    startActivityForResult(intent, 26);
                }
                if (position == 27) {
                    Intent intent = new Intent(view.getContext(), WorkoutLWEasyD28.class);
                    startActivityForResult(intent, 27);
                }
            }
        });
    }
}
