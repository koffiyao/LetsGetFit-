package com.ykeocorp.letsgetfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ykeocorp.letsgetfit.GWEasy_Java.ScheduleGWeightEasy;
import com.ykeocorp.letsgetfit.GWHard_Java.ScheduleGWeightHard;
import com.ykeocorp.letsgetfit.GWMedium_Java.ScheduleGWeightMedium;

public class GainWeightTrainingDifficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_weight_training_difficulty);
    }

    public void openGWEasy(View view) {
        Intent intent = new Intent(this, ScheduleGWeightEasy.class);
        startActivity(intent);
    }

    // Open schedule for medium program
    public void openGWMedium(View view) {
        Intent intent = new Intent(this, ScheduleGWeightMedium.class);
        startActivity(intent);
    }

    // Open schedule for hard program
    public void openGWHard(View view) {
        Intent intent = new Intent(this, ScheduleGWeightHard.class);
        startActivity(intent);
    }
}
