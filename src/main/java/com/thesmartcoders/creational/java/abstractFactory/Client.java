package com.thesmartcoders.creational.java.abstractFactory;

public class Client {

    private RoomTilePatternFactory roomTilePatternFactory;

    public Client(ClassicRoomTilePatternFactory roomTilePatternFactory) {
        this.roomTilePatternFactory = roomTilePatternFactory;
    }

    public RoomTilePatternFactory getRoomTilePatternFactory() {
        return roomTilePatternFactory;
    }
}
