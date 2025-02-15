package org.project_simulation.dto;

import org.project_simulation.entitys.Entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapSettings {

    /**
     * Свойства карты
     */

    private Map<Cell, Optional<Entity>> cellMap;


    private final int width;
    private int height;


    public MapSettings(GameMap map) {

        this.width = map.getWidth();
        this.height = map.getHeight();
        this.cellMap = map.getCells();
    }

    public Map<Cell, Optional<Entity>> getCellMap() {
        return cellMap;
    }

    public void setCellMap(Map<Cell, Optional<Entity>> cellMap) {
        this.cellMap = cellMap;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}



