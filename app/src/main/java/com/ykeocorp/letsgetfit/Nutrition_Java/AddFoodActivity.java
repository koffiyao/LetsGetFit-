package com.ykeocorp.letsgetfit.Nutrition_Java;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ykeocorp.letsgetfit.R;

public class AddFoodActivity extends AppCompatActivity implements View.OnClickListener {

    public final static String CALORIE_KEY = "Nutrition_Java.calorie_key";
    TextView calorieDisplay;
    Button saveGoal;
    Button loadGoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String value = intent.getStringExtra(CALORIE_KEY);

        setContentView(R.layout.activity_add_food);

        setupVariables();
        calorieDisplay.setText(value);
    }

    private void setupVariables() {
        calorieDisplay = (TextView) findViewById(R.id.textView_calorieDisplay);
        saveGoal = (Button) findViewById(R.id.saveGoal_button);
        loadGoal = (Button) findViewById(R.id.loadGoal_button);

        saveGoal.setOnClickListener(this);
    }

    private void setPrefs(String key, String value) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    private void loadPrefs() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String calorieValue = sharedPreferences.getString("CAL", "");
        calorieDisplay.setText(calorieValue);
    }

    @Override
    public void onClick(View v) {
        setPrefs("CAL", (calorieDisplay.getText().toString()));
        Toast.makeText(this, "Goal saved", Toast.LENGTH_SHORT).show();
    }

    public void loadGoal(View view) {
        loadPrefs();
        Toast.makeText(this, "Goal loaded", Toast.LENGTH_SHORT).show();
    }
}
