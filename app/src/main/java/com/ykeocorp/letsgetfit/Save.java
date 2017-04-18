package com.ykeocorp.letsgetfit;

/**
 * Created by Ama on 4/13/2017.
 */

public class Save {
    public static int weight, age;
    public static String gender;

    public static void setWeight(int weight) {
        Save.weight = weight;
    }

    public static int getWeight() {
        return weight;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        Save.gender = gender;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Save.age = age;
    }
}
