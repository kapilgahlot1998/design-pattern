package com.thesmartcoders.creational.java.builder.standardImplementation;

public class Runner {

    public static void main(String[] args) {
        NutritionFacts.Builder builder = NutritionFacts.getBuilder(10, 5);
        NutritionFacts nutritionFacts = builder.addCalories(100).addFat(10).build();
        System.out.println(nutritionFacts.toString());
    }
}
