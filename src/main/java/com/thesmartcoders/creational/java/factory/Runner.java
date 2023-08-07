package com.thesmartcoders.creational.java.factory;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        //I need a polygon which have 3 sides
        Scanner s = new Scanner(System.in);
        System.out.println(PolygonFactory.getPolygon(s.nextInt()).getClass());
        System.out.println(PolygonFactory.getPolygon(s.nextInt()).getClass());
        System.out.println(PolygonFactory.getPolygon(s.nextInt()).getClass());
    }
}
