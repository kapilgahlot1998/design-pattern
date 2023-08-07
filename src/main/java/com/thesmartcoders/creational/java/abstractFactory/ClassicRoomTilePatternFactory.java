package com.thesmartcoders.creational.java.abstractFactory;

import com.thesmartcoders.creational.java.abstractFactory.FloorTiles.ClassicFloorTile;
import com.thesmartcoders.creational.java.abstractFactory.FloorTiles.FloorTile;
import com.thesmartcoders.creational.java.abstractFactory.WallTiles.ClassicWallTile;
import com.thesmartcoders.creational.java.abstractFactory.WallTiles.WallTile;

public class ClassicRoomTilePatternFactory implements RoomTilePatternFactory {
    @Override
    public FloorTile getFloorTile() {
        return new ClassicFloorTile();
    }

    @Override
    public WallTile getWallTile() {
        return new ClassicWallTile();
    }
}
