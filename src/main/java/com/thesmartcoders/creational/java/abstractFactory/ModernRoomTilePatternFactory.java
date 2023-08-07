package com.thesmartcoders.creational.java.abstractFactory;

import com.thesmartcoders.creational.java.abstractFactory.FloorTiles.FloorTile;
import com.thesmartcoders.creational.java.abstractFactory.FloorTiles.ModernFloorTile;
import com.thesmartcoders.creational.java.abstractFactory.WallTiles.ModernWallTile;
import com.thesmartcoders.creational.java.abstractFactory.WallTiles.WallTile;

public class ModernRoomTilePatternFactory implements RoomTilePatternFactory {
    @Override
    public FloorTile getFloorTile() {
        return new ModernFloorTile();
    }

    @Override
    public WallTile getWallTile() {
        return new ModernWallTile();
    }
}
