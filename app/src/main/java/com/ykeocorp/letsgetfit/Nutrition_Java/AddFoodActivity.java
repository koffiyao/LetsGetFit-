package com.ykeocorp.letsgetfit.Nutrition_Java;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.stream.JsonReader;
import com.ykeocorp.letsgetfit.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AddFoodActivity extends AppCompatActivity {

    TextView calorieDisplay;
    Button saveGoal;
    Button loadGoal;
    EditText foodText;
    ListView result;
    AddFoodAdpter addFoodAdpter;

    public final static String CALORIE_KEY = "Nutrition_Java.calorie_key";

    static final String APP_ID = "65009ff2";
    static final String APP_KEY = "28a51cd162c6898cb107d06b74ef1bcc";
    static final String API_URL_SEARCH = "https://api.nutritionix.com/v1_1/search/";
    static final String FIELD = "?results=0%3A10&" +
            "fields=item_name%2Cbrand_name%2Cnf_calories" +
            "%2Cnf_total_fat%2Cnf_total_carbohydrate%2Cnf_protein" +
            "%2Cnf_serving_size_qty%2Cnf_serving_size_unit";

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
        foodText = (EditText) findViewById(R.id.food_editText);
        result = (ListView) findViewById(R.id.addFood_listView);
        Button queryButton = (Button) findViewById(R.id.button2);
        queryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AddFoodActivity.RetrieveFeedTask().execute();
            }
        });

        addFoodAdpter = new AddFoodAdpter(this, R.layout.row_add_food);
        result.setAdapter(addFoodAdpter);
    }


    class RetrieveFeedTask extends AsyncTask<Void, Void, String> {

        protected void onPreExecute() {
        }

        protected String doInBackground(Void... urls) {
            String food = foodText.getText().toString();

            try {

                URL url = new URL(API_URL_SEARCH + food + FIELD +
                        "&appId=" + APP_ID + "&appKey=" + APP_KEY);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                    StringBuilder stringBuilder = new StringBuilder();
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        stringBuilder.append(line).append("\n");
                    }
                    bufferedReader.close();

                    return stringBuilder.toString();
                } finally {
                    urlConnection.disconnect();
                }
            } catch (Exception e) {
                Log.e("ERROR", e.getMessage(), e);
                return null;
            }
        }

        protected void onPostExecute(String response) {
            if (response == null) {
                response = "THERE WAS AN ERROR";
            }
            // convert response from JSON to a prettier format and display it on the UI
            try{
                JSONObject obj = new JSONObject(response); // convert response to a JSON object
                JSONArray arr = obj.getJSONArray("hits");   // look in the result and look in 'hits'
                String item_name, brand_name;
                double calorie;

                // only show top 10 results
                for (int count = 0; count < 10; count++){
                    JSONObject _result = arr.getJSONObject(count);
                    JSONObject object = _result.getJSONObject("fields");
                    item_name = object.getString("item_name");
                    brand_name = object.getString("brand_name");
                    calorie = object.getDouble("nf_calories");
                    FieldTroncate fieldTroncate = new FieldTroncate(item_name, brand_name, calorie);

                    addFoodAdpter.add(fieldTroncate);

                }
            } catch (JSONException e){
                Log.e("Error!", e.getMessage(), e);
            }
        }
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

    public void loadGoal(View view) {
        loadPrefs();
        Toast.makeText(this, "Goal loaded", Toast.LENGTH_SHORT).show();
    }

    public void saveGoal (View view) {
        setPrefs("CAL", (calorieDisplay.getText().toString()));
        Toast.makeText(this, "Goal saved", Toast.LENGTH_SHORT).show();
    }
}
