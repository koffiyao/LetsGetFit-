package com.ykeocorp.letsgetfit.GWMedium_Java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD1;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD10;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD11;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD12;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD13;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD14;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD15;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD16;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD17;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD18;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD19;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD2;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD20;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD21;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD22;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD23;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD24;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD25;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD26;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD27;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD28;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD3;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD4;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD5;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD6;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD7;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD8;
import com.ykeocorp.letsgetfit.LWMedium_Java.WorkoutLWMediumD9;
import com.ykeocorp.letsgetfit.R;

public class ScheduleGWeightMedium extends AppCompatActivity {
    ListView GW_mediumListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_gw_medium);

        GW_mediumListView = (ListView) findViewById(R.id.GW_mediumListView);

        // components of the list on the screen
        final String[] days = {"Day 1", "Day 2", "Day 3", "Day 4", "Day 5",
                "Day 6", "Day 7", "Day 8", "Day 9", "Day 10", "Day 11", "Day 12",
                "Day 13", "Day 14", "Day 15", "Day 16", "Day 17", "Day 18",
                "Day 19", "Day 20", "Day 21", "Day 22", "Day 23", "Day 24",
                "Day 25", "Day 26", "Day 27", "Day 28"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1,days);

        GW_mediumListView.setAdapter(adapter);

        GW_mediumListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {    //open program on day 1
                    Intent intent = new Intent(view.getContext(),WorkoutGWMediumD1.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 1) {    //Day 2
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD2.class);
                    startActivityForResult(intent, 1);
                }
                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD3.class);
                    startActivityForResult(intent, 2);
                }
                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD4.class);
                    startActivityForResult(intent, 3);
                }
                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD5.class);
                    startActivityForResult(intent, 4);
                }
                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD6.class);
                    startActivityForResult(intent, 5);
                }
                if (position == 6) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD7.class);
                    startActivityForResult(intent, 6);
                }
                if (position == 7) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD8.class);
                    startActivityForResult(intent, 7);
                }
                if (position == 8) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD9.class);
                    startActivityForResult(intent, 8);
                }
                if (position == 9) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD10.class);
                    startActivityForResult(intent, 9);
                }
                if (position == 10) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD11.class);
                    startActivityForResult(intent, 10);
                }
                if (position == 11) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD12.class);
                    startActivityForResult(intent, 11);
                }
                if (position == 12) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD13.class);
                    startActivityForResult(intent, 12);
                }
                if (position == 13) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD14.class);
                    startActivityForResult(intent, 13);
                }
                if (position == 14) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD15.class);
                    startActivityForResult(intent, 14);
                }
                if (position == 15) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD16.class);
                    startActivityForResult(intent, 15);
                }
                if (position == 16) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD17.class);
                    startActivityForResult(intent, 16);
                }
                if (position == 17) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD18.class);
                    startActivityForResult(intent, 17);
                }
                if (position == 18) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD19.class);
                    startActivityForResult(intent, 18);
                }
                if (position == 19) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD20.class);
                    startActivityForResult(intent, 19);
                }
                if (position == 20) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD21.class);
                    startActivityForResult(intent, 20);
                }
                if (position == 21) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD22.class);
                    startActivityForResult(intent, 21);
                }
                if (position == 22) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD23.class);
                    startActivityForResult(intent, 22);
                }
                if (position == 23) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD24.class);
                    startActivityForResult(intent, 23);
                }
                if (position == 24) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD25.class);
                    startActivityForResult(intent, 24);
                }
                if (position == 25) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD26.class);
                    startActivityForResult(intent, 25);
                }
                if (position == 26) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD27.class);
                    startActivityForResult(intent, 26);
                }
                if (position == 27) {   // Day 28
                    Intent intent = new Intent(view.getContext(), WorkoutGWMediumD28.class);
                    startActivityForResult(intent, 27);
                }
            }
        });
    }
}
