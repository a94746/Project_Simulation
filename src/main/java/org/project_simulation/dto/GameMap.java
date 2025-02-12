package org.project_simulation.DTO;

import org.project_simulation.entitys.Entity;

import java.util.HashMap;
import java.util.Map;

public class GameMap {

    /**
     * Игровая карта
     */

    private final int width;      // длина игрового поля
    private final int height;     // ширина игрового поля

    private Map<Cell, Entity> cells = new HashMap<>();

    public GameMap(int side) {
        this.width = side;
        this.height = side;
        this.cells = new HashMap<>();
    }


    public void setCells(Map<Cell, Entity> entities) {
        this.cells = entities;
    }

    public Map<Cell, Entity> getCells() {
        return cells;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void addEntity(Cell cell, Entity entity) {
        cells.put(cell, entity);
    }

    public void removeEntity(Cell cell) {
        cells.remove(cell);
    }

    public Entity getEntity(Cell cell) {
        return cells.get(cell);
    }



    public boolean isCellEmpty(Cell cell) {
        if (cell == null) {
            return true;
        }
        return cells.containsKey(cell);
    }

}
