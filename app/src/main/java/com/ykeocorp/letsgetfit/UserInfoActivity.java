package com.ykeocorp.letsgetfit;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


/**
 * Created by Ama on 4/10/2017.
 */


public class UserInfoActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton maleButton, femaleButton, gmButton, lwButton;
    Button save;
    EditText age, h_feet, h_inch, weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);

        setupVariables();
        loadPrefs();
    }

    private void setupVariables() {

        maleButton = (RadioButton) findViewById(R.id.maleButton);
        femaleButton = (RadioButton) findViewById(R.id.femaleButton);
        gmButton = (RadioButton) findViewById(R.id.GMradioButton);
        lwButton = (RadioButton) findViewById(R.id.LWRadioButton);

        age = (EditText) findViewById(R.id.age);
        h_feet = (EditText) findViewById(R.id.height_ft);
        h_inch = (EditText) findViewById(R.id.height_in);
        weight = (EditText) findViewById(R.id.weight);

        save = (Button) findViewById(R.id.saveButton);

        save.setOnClickListener(this);
    }

    private void loadPrefs() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        int weightValue = sharedPreferences.getInt("WEIGHT", 0);
        int h_ftValue = sharedPreferences.getInt("H_FT", 0);
        int h_inValue = sharedPreferences.getInt("H_IN", 0);
        int ageValue = sharedPreferences.getInt("AGE", 0);

        boolean mButtonValue = sharedPreferences.getBoolean("MALE", false);
        boolean fButtonValue = sharedPreferences.getBoolean("FEMALE", false);

        boolean gmButtonValue = sharedPreferences.getBoolean("GAIN", false);
        boolean lwButtonValue = sharedPreferences.getBoolean("LOSE", false);

        weight.setText("" + weightValue);
        h_feet.setText("" + h_ftValue);
        h_inch.setText("" + h_inValue);
        age.setText("" + ageValue);

        if (mButtonValue) {
            maleButton.setChecked(true);
            femaleButton.setChecked(false);
        }

        if (fButtonValue) {
            femaleButton.setChecked(true);
            maleButton.setChecked(false);
        }

        if (gmButtonValue) {
            gmButton.setChecked(true);
            lwButton.setChecked(false);
        }

        if (lwButtonValue) {
            lwButton.setChecked(true);
            gmButton.setChecked(false);
        }
    }

    private void setPrefs(String key, int value) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    private void setPrefs(String key, boolean value) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }


    @Override
    public void onClick(View v) {
        setPrefs("WEIGHT", Integer.parseInt(weight.getText().toString()));
        setPrefs("H_FT", Integer.parseInt(h_feet.getText().toString()));
        setPrefs("H_IN", Integer.parseInt(h_inch.getText().toString()));
        setPrefs("AGE", Integer.parseInt(age.getText().toString()));

        setPrefs("MALE", maleButton.isChecked());
        setPrefs("FEMALE", femaleButton.isChecked());

        setPrefs("GAIN", gmButton.isChecked());
        setPrefs("LOSE", lwButton.isChecked());



    }
}
