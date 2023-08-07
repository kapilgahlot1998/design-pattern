package com.thesmartcoders.creational.java.builder.freeBuilderLibrary;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public interface NutritionFacts {

    String getName();
    int getAge();
    String getDepartment();

    class Builder extends NutritionFacts_Builder {

        public Builder(){
            setDepartment("this is depart");
        }

        @Override
        public Builder setAge(int age){
            if(age > 18){
                return super.setAge(age);
            }else
                throw new RuntimeException("Child");
        }
    }

}
