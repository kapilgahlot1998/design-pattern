package com.thesmartcoders.creational.java.builder.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Getter
@Builder
public class NutritionFacts {

    private final int servingSize;  // Required
    private final int servings;     // Required
    private final int calories;     // Optional
    private final int fat;          // Optional
    @Singular private final List<Integer> params;          // Optional
    @Singular("myName") private final List<String> name;          // Optional

}
