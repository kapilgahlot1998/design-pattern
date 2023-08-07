package com.thesmartcoders.structural.java.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFlyweight {

    private static Map<String, Vehicle> vehicleList = new HashMap<>();

    public static Vehicle createVehicle(String color){
        return vehicleList.computeIfAbsent(color, newColor -> vehicleList.put(newColor, new Car(newColor)));
    }

    public static int getCacheElements(){
        return vehicleList.size();
    }


}
