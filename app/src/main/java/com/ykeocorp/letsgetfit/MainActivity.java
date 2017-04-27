package com.ykeocorp.letsgetfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ykeocorp.letsgetfit.Nutrition_Java.NutritionActivity;
import com.ykeocorp.letsgetfit.Workout_Java.WorkoutActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Open Workout when user clicks on workout **/
    public void openWorkout(View view) {
        Intent intent = new Intent(this, WorkoutActivity.class);
        startActivity(intent);
    }

    /** Open Nutrition **/
    public void openNutrition(View view) {
        Intent intent = new Intent(this, NutritionActivity.class);
        startActivity(intent);
    }

    /** Open User Info **/
    public void openUserInfo(View view) {
        Intent intent = new Intent(this, UserInfoActivity.class);
        startActivity(intent);
    }

    /** Open Settings **/
    public void openSettings(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
