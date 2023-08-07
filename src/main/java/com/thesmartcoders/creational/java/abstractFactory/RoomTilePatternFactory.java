package com.thesmartcoders.creational.java.abstractFactory;

import com.thesmartcoders.creational.java.abstractFactory.FloorTiles.FloorTile;
import com.thesmartcoders.creational.java.abstractFactory.WallTiles.WallTile;

public interface RoomTilePatternFactory {

    FloorTile getFloorTile();

    WallTile getWallTile();

}
