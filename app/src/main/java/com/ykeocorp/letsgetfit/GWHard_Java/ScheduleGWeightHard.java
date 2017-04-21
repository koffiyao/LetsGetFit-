package com.ykeocorp.letsgetfit.GWHard_Java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD1;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD10;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD11;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD12;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD13;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD14;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD15;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD16;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD17;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD18;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD19;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD2;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD20;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD21;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD22;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD23;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD24;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD25;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD26;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD27;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD28;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD3;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD4;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD5;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD6;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD7;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD8;
import com.ykeocorp.letsgetfit.LWHard_Java.WorkoutLWHardD9;
import com.ykeocorp.letsgetfit.R;

public class ScheduleGWeightHard extends AppCompatActivity {
    ListView GW_hardListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_gw_hard);

        GW_hardListView = (ListView) findViewById(R.id.GW_hardListView);

        // components of the list on the screen
        final String[] days = {"Day 1", "Day 2", "Day 3", "Day 4", "Day 5",
                "Day 6", "Day 7", "Day 8", "Day 9", "Day 10", "Day 11", "Day 12",
                "Day 13", "Day 14", "Day 15", "Day 16", "Day 17", "Day 18",
                "Day 19", "Day 20", "Day 21", "Day 22", "Day 23", "Day 24",
                "Day 25", "Day 26", "Day 27", "Day 28"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1,days);

        GW_hardListView.setAdapter(adapter);

        GW_hardListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {    //open program on day 1
                    Intent intent = new Intent(view.getContext(),WorkoutGWHardD1.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 1) {    //Day 2
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD2.class);
                    startActivityForResult(intent, 1);
                }
                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD3.class);
                    startActivityForResult(intent, 2);
                }
                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD4.class);
                    startActivityForResult(intent, 3);
                }
                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD5.class);
                    startActivityForResult(intent, 4);
                }
                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD6.class);
                    startActivityForResult(intent, 5);
                }
                if (position == 6) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD7.class);
                    startActivityForResult(intent, 6);
                }
                if (position == 7) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD8.class);
                    startActivityForResult(intent, 7);
                }
                if (position == 8) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD9.class);
                    startActivityForResult(intent, 8);
                }
                if (position == 9) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD10.class);
                    startActivityForResult(intent, 9);
                }
                if (position == 10) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD11.class);
                    startActivityForResult(intent, 10);
                }
                if (position == 11) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD12.class);
                    startActivityForResult(intent, 11);
                }
                if (position == 12) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD13.class);
                    startActivityForResult(intent, 12);
                }
                if (position == 13) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD14.class);
                    startActivityForResult(intent, 13);
                }
                if (position == 14) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD15.class);
                    startActivityForResult(intent, 14);
                }
                if (position == 15) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD16.class);
                    startActivityForResult(intent, 15);
                }
                if (position == 16) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD17.class);
                    startActivityForResult(intent, 16);
                }
                if (position == 17) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD18.class);
                    startActivityForResult(intent, 17);
                }
                if (position == 18) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD19.class);
                    startActivityForResult(intent, 18);
                }
                if (position == 19) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD20.class);
                    startActivityForResult(intent, 19);
                }
                if (position == 20) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD21.class);
                    startActivityForResult(intent, 20);
                }
                if (position == 21) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD22.class);
                    startActivityForResult(intent, 21);
                }
                if (position == 22) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD23.class);
                    startActivityForResult(intent, 22);
                }
                if (position == 23) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD24.class);
                    startActivityForResult(intent, 23);
                }
                if (position == 24) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD25.class);
                    startActivityForResult(intent, 24);
                }
                if (position == 25) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD26.class);
                    startActivityForResult(intent, 25);
                }
                if (position == 26) {
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD27.class);
                    startActivityForResult(intent, 26);
                }
                if (position == 27) {   // Day 28
                    Intent intent = new Intent(view.getContext(), WorkoutGWHardD28.class);
                    startActivityForResult(intent, 27);
                }
            }
        });
    }
}
