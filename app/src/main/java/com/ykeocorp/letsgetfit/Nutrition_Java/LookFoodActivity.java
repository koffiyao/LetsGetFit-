package com.ykeocorp.letsgetfit.Nutrition_Java;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.ykeocorp.letsgetfit.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LookFoodActivity extends AppCompatActivity {

    EditText foodText;
    ListView result;
    FoodInfoAdapter food_infoAdapter;

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
        setContentView(R.layout.activity_look_food);

        foodText = (EditText) findViewById(R.id.editText);
        result = (ListView) findViewById(R.id.food_listView);
        Button queryButton = (Button) findViewById(R.id.button);
        queryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new LookFoodActivity.RetrieveFeedTask().execute();
            }
        });

        food_infoAdapter = new FoodInfoAdapter(this, R.layout.food_info_layout);
        result.setAdapter(food_infoAdapter);
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
                String item_name, brand_name, serving_unit;
                double protein, calorie, carbs, fat;
                int serving_size;

                // only show top 10 results
                for (int count = 0; count < 10; count++){
                    JSONObject _result = arr.getJSONObject(count);
                    JSONObject object = _result.getJSONObject("fields");
                    item_name = object.getString("item_name");
                    brand_name = object.getString("brand_name");
                    calorie = object.getDouble("nf_calories");
                    protein = object.getDouble("nf_protein");
                    carbs = object.getDouble("nf_total_carbohydrate");
                    fat = object.getDouble("nf_total_fat");
                    serving_size = object.getInt("nf_serving_size_qty");
                    serving_unit = object.getString("nf_serving_size_unit");

                    Fields fields = new Fields(item_name, brand_name, calorie, fat, carbs,
                                                protein, serving_size, serving_unit);

                    food_infoAdapter.add(fields);

                }
            } catch (JSONException e){
                Log.e("Error!", e.getMessage(), e);
            }
        }
    }
}
