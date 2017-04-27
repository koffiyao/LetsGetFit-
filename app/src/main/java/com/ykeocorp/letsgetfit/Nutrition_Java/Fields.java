package com.ykeocorp.letsgetfit.Nutrition_Java;

/**
 * Created by Oswald on 4/11/2017.
 */

public class Fields {
        private String item_name;
        private String brand_name;
        private double calories;
        private double fat;
        private double carbohydrate;
        private double protein;
        private int serving_size;
        private String serving_unit;

        public Fields(String item_name, String brand_name, double calories, double fat,
                      double carbohydrate, double protein, int serving_size, String serving_unit) {

                this.setItem_name(item_name);
                this.setBrand_name(brand_name);
                this.setCalories(calories);
                this.setCarbohydrate(carbohydrate);
                this.setFat(fat);
                this.setProtein(protein);
                this.setServing_size(serving_size);
                this.setServing_unit(serving_unit);
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

        public double getFat() {
                return fat;
        }

        public void setFat(double fat) {
                this.fat = fat;
        }

        public double getCarbohydrate() {
                return carbohydrate;
        }

        public void setCarbohydrate(double carbohydrate) {
                this.carbohydrate = carbohydrate;
        }

        public double getProtein() {
                return protein;
        }

        public void setProtein(double protein) {
                this.protein = protein;
        }

        public int getServing_size() {
                return serving_size;
        }

        public void setServing_size(int serving_size) {
                this.serving_size = serving_size;
        }

        public String getServing_unit() {
                return serving_unit;
        }

        public void setServing_unit(String serving_unit) {
                this.serving_unit = serving_unit;
        }
}


