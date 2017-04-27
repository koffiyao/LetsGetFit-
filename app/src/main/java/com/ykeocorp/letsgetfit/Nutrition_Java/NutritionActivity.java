package com.ykeocorp.letsgetfit.Nutrition_Java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ykeocorp.letsgetfit.R;

public class NutritionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);
    }

    public void openLookFood(View view) {
        Intent intent = new Intent(this, LookFoodActivity.class);
        startActivity(intent);
    }
}
