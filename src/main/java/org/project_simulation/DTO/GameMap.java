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

    private Map<Cell, Entity> entities = new HashMap<>();

    public GameMap(int side) {
        this.width = side;
        this.height = side;
        this.entities = new HashMap<>();
    }


    public void setEntities(Map<Cell, Entity> entities) {
        this.entities = entities;
    }

    public Map<Cell, Entity> getEntities() {
        return entities;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void addEntity(Cell cell, Entity entity) {
        entities.put(cell, entity);
    }

    public void removeEntity(Cell cell) {
        entities.remove(cell);
    }

    public Entity getEntity(Cell cell) {
        return entities.get(cell);
    }



    public boolean isCellEmpty(Cell cell) {
        if (cell == null) {
            return true;
        }
        return entities.containsKey(cell);
    }

}
