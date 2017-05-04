package com.ykeocorp.letsgetfit.Nutrition_Java;

/**
 * Created by Audrey on 5/3/2017.
 */

public class FieldTroncate {
    private String item_name;
    private String brand_name;
    private double calories;

    public FieldTroncate(String item_name, String brand_name, double calories) {

        this.setItem_name(item_name);
        this.setBrand_name(brand_name);
        this.setCalories(calories);
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
