package com.ykeocorp.letsgetfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ykeocorp.letsgetfit.LWEasy_Java.ScheduleLWeightEasy;
import com.ykeocorp.letsgetfit.LWHard_Java.ScheduleLWeightHard;
import com.ykeocorp.letsgetfit.LWMedium_Java.ScheduleLWeightMedium;

public class TrainingDifficultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_difficulty);
    }

    // Open schedule for easy program
    public void openEasy(View view) {
        Intent intent = new Intent(this, ScheduleLWeightEasy.class);
        startActivity(intent);
    }

    // Open schedule for medium program
    public void openMedium(View view) {
        Intent intent = new Intent(this, ScheduleLWeightMedium.class);
        startActivity(intent);
    }

    // Open schedule for hard program
    public void openHard(View view) {
        Intent intent = new Intent(this, ScheduleLWeightHard.class);
        startActivity(intent);
    }
}
