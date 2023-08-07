package com.thesmartcoders.creational.java.builder.freeBuilderLibrary;

public class Runner {
    public static void main(String[] args) {
        NutritionFacts.Builder builder = new NutritionFacts.Builder();

        NutritionFacts employee = builder.setName("baeldung")
                .setAge(20)
                .mapAge(x -> x*10)
                .build();

        System.out.println(employee);
    }
}
