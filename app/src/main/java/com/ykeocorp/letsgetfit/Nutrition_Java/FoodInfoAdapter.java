package com.ykeocorp.letsgetfit.Nutrition_Java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ykeocorp.letsgetfit.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Audrey on 4/25/2017.
 */

public class FoodInfoAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public FoodInfoAdapter(Context context, int resource) {
        super(context, resource);
    }

    public void add(Fields object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View foodInfo = convertView;
        FieldsHolder fieldsHolder;

        if (foodInfo == null) {
            LayoutInflater layoutInflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            foodInfo = layoutInflater.inflate(R.layout.food_info_layout, parent, false);
            fieldsHolder = new FieldsHolder();
            fieldsHolder.item_text = (TextView)foodInfo.findViewById(R.id.item_name);
            fieldsHolder.brand_text = (TextView)foodInfo.findViewById(R.id.brand_name);
            fieldsHolder.calorie_text = (TextView)foodInfo.findViewById(R.id.calorie_value);
            fieldsHolder.fat_text = (TextView)foodInfo.findViewById(R.id.fat_value);
            fieldsHolder.carbs_text = (TextView)foodInfo.findViewById(R.id.carbs_value);
            fieldsHolder.protein_text = (TextView)foodInfo.findViewById(R.id.protein_value);
            fieldsHolder.serving_size_text = (TextView)foodInfo.findViewById(R.id.serving_size_value);
            fieldsHolder.serving_unit_text = (TextView)foodInfo.findViewById(R.id.serving_unit_value);
            foodInfo.setTag(fieldsHolder);
        }
        else {
            fieldsHolder = (FieldsHolder) foodInfo.getTag();
        }

        Fields fields = (Fields) this.getItem(position);
        fieldsHolder.item_text.setText(fields.getItem_name());
        fieldsHolder.brand_text.setText(fields.getBrand_name());
        fieldsHolder.calorie_text.setText((Double.toString(fields.getCalories())));
        fieldsHolder.fat_text.setText(Double.toString(fields.getFat()));
        fieldsHolder.carbs_text.setText(Double.toString(fields.getCarbohydrate()));
        fieldsHolder.protein_text.setText(Double.toString(fields.getProtein()));
        fieldsHolder.serving_size_text.setText("" + (fields.getServing_size()));
        fieldsHolder.serving_unit_text.setText(fields.getServing_unit());

        return foodInfo;
    }

    static class FieldsHolder {
        TextView item_text, brand_text, calorie_text, fat_text, carbs_text, protein_text;
        TextView serving_size_text, serving_unit_text;
    }
}
