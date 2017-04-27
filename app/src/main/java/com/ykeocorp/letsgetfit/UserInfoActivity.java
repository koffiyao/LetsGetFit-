package com.ykeocorp.letsgetfit;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.attr.duration;
import static java.sql.Types.NULL;

/**
 * Created by Ama on 4/10/2017.
 */


public class UserInfoActivity extends AppCompatActivity {
//    Toast toast;
//    public static int weight, age;
//    public static String gender;
//    Context context = getApplicationContext();
//    int duration = Toast.LENGTH_SHORT;
//    RadioButton male, female;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
    }

    // Saves the user information
//    public void saveInfo() {
//        String successText = "Your information has been saved.";
//        String errorText = "Your information cannot be saved.";
//
//        Save.setAge(R.id.age);
//        Save.setWeight(R.id.weight);
//        male = (RadioButton) findViewById(R.id.maleButton);
//        female = (RadioButton) findViewById(R.id.femaleButton);
//
//        if (male.isChecked() && !female.isChecked())
//            Save.setGender("male");
//        else if (female.isChecked() && !male.isChecked())
//            Save.setGender("female");
//
//        age = Save.getAge();
//        weight = Save.getWeight();
//        gender = Save.getGender();
//
//        // Checks to make sure user has entered all information
//        if (age == NULL || weight == NULL || gender == "") {
//            toast = Toast.makeText(context, errorText, duration);
//            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 0);
//            toast.show();
//        } else {
//            toast = Toast.makeText(context, successText, duration);
//            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 0);
//            toast.show();
//        }
//    }
}
