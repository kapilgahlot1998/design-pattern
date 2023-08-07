package com.thesmartcoders.structural.java.flyweight;

public class Runner {
    public static void main(String[] args) {
        Vehicle  vehicleRed = VehicleFlyweight.createVehicle("Red");
        Vehicle  vehicleBlack = VehicleFlyweight.createVehicle("Black");

        System.out.println("Cache size : " + VehicleFlyweight.getCacheElements());

        Vehicle vehicleRed2 = VehicleFlyweight.createVehicle("Red");
        Vehicle vehicleBlack2 = VehicleFlyweight.createVehicle("Black");

        System.out.println("Cache size : " + VehicleFlyweight.getCacheElements());

    }
}
