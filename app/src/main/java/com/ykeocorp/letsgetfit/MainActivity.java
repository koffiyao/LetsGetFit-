package com.ykeocorp.letsgetfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   // public static final  String EXTRA_MESSAGE = "com.example.letsgetfit.Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Open Workout when user clicks on workout **/
    public void openWorkout(View view) {
        Intent intent = new Intent(this,WorkoutActivity.class);
        startActivity(intent);
    }

    /** Open Nutrition **/
    public void openNutrition(View view) {
        Intent intent = new Intent(this, NutritionActivity.class);
        startActivity(intent);
    }
}
