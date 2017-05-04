package com.ykeocorp.letsgetfit.Nutrition_Java;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;

import com.ykeocorp.letsgetfit.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oswald on 5/3/2017.
 */

public class AddFoodAdpter extends ArrayAdapter{

    List list = new ArrayList();

    public AddFoodAdpter(Context context, int resource) {
        super(context, resource);
    }

    public void add(FieldTroncate object) {
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

        View addFood = convertView;
        FieldTroncateHolder fieldTroncateHolder;

        if (addFood == null) {
            LayoutInflater layoutInflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            addFood = layoutInflater.inflate(R.layout.row_add_food, parent, false);
            fieldTroncateHolder = new FieldTroncateHolder();
            fieldTroncateHolder.item_text = (CheckedTextView) addFood.findViewById(R.id.name_checkedTextView);
            fieldTroncateHolder.brand_text = (TextView)addFood.findViewById(R.id.brand_textView);
            fieldTroncateHolder.calorie_text = (TextView)addFood.findViewById(R.id.cal_value);

            addFood.setTag(fieldTroncateHolder);
        }
        else {
            fieldTroncateHolder = (FieldTroncateHolder) addFood.getTag();
        }

        FieldTroncate fieldTroncate = (FieldTroncate) this.getItem(position);
        fieldTroncateHolder.item_text.setText(fieldTroncate.getItem_name());
        fieldTroncateHolder.brand_text.setText(fieldTroncate.getBrand_name());
        fieldTroncateHolder.calorie_text.setText((Double.toString(fieldTroncate.getCalories())));


        return addFood;
    }

    static class FieldTroncateHolder {
        TextView brand_text, calorie_text;
        CheckedTextView item_text;
    }



}
