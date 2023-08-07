package com.thesmartcoders.creational.java.builder.lombok;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        NutritionFacts.NutritionFactsBuilder nutritionFactsBuilder = NutritionFacts.builder();

        NutritionFacts nutritionFacts = nutritionFactsBuilder
                .fat(100)
                .calories(200)
                .servingSize(10)
                .servings(14)
                .params(Arrays.asList(1, 2, 3))
                .param(4)
                .param(5)
                .myName("Kapil")
                .name(Arrays.asList("Gahlot", "Jai"))
                .build();

        System.out.println(nutritionFacts);


    }
}
