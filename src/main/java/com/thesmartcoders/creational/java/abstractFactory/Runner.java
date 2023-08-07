package com.thesmartcoders.creational.java.abstractFactory;

public class Runner {

    public static void main(String[] args) {
        Client client = new Client(new ClassicRoomTilePatternFactory());
        System.out.println(client.getRoomTilePatternFactory().getFloorTile().getName());
        System.out.println(client.getRoomTilePatternFactory().getWallTile().getSize());
    }

}
