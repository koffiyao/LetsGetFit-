package com.ykeocorp.letsgetfit.Workout_Java.Lose_Weight_Java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ykeocorp.letsgetfit.Workout_Java.Lose_Weight_Java.LWEasy_Java.ScheduleLWeightEasy;
import com.ykeocorp.letsgetfit.Workout_Java.Lose_Weight_Java.LWHard_Java.ScheduleLWeightHard;
import com.ykeocorp.letsgetfit.Workout_Java.Lose_Weight_Java.LWMedium_Java.ScheduleLWeightMedium;
import com.ykeocorp.letsgetfit.R;

public class LoseWeightTrainingDifficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose_weight_training_difficulty);
    }

    // Open schedule for easy program
    public void openLWEasy(View view) {
        Intent intent = new Intent(this, ScheduleLWeightEasy.class);
        startActivity(intent);
    }

    // Open schedule for medium program
    public void openLWMedium(View view) {
        Intent intent = new Intent(this, ScheduleLWeightMedium.class);
        startActivity(intent);
    }

    // Open schedule for hard program
    public void openLWHard(View view) {
        Intent intent = new Intent(this, ScheduleLWeightHard.class);
        startActivity(intent);
    }
}
