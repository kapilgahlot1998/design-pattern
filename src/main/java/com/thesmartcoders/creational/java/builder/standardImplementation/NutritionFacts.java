package com.thesmartcoders.creational.java.builder.standardImplementation;

public class NutritionFacts {
    private final int servingSize;  // Required
    private final int servings;     // Required
    private final int calories;     // Optional
    private final int fat;          // Optional

    public static class Builder{
        private final int servingSize;  // Required
        private final int servings;     // Required
        private int calories;     // Optional
        private int fat;          // Optional

        Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        Builder addCalories(int calories){
            this.calories = calories;
            return this;
        }

        Builder addFat(int fat){
            this.fat = fat;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }



    }

    public static Builder getBuilder(int servingSize, int servings){
        return new Builder(servingSize, servings);
    }

    private NutritionFacts(Builder builder){
        this.calories = builder.calories;
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.fat = builder.fat;
    }

    @Override
    public String toString() {
        return this.servingSize + "--" + this.servings + "--" + this.calories + "--" + this.fat;
    }
}
