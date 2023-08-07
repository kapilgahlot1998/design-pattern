package com.thesmartcoders.creational.java.factory;

public class PolygonFactory {

    public static Polygon getPolygon(int noOfSide){
        switch (noOfSide){
            case 3 :
                return new Triangle();
            case 4 :
                return new Square();
            default:
                return new Pentagon();
        }
    }

}
