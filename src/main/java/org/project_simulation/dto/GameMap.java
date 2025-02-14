package org.project_simulation.dto;

import org.project_simulation.entitys.Entity;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GameMap {

    /**
     * Игровая карта
     */

    private final int width;      // длина игрового поля
    private final int height;     // ширина игрового поля
    private Map<Cell, Optional<Entity>> cells;          // карта клеток с сущностями

    public GameMap(int side) {
        this.width = side;
        this.height = side;
        this.cells = new HashMap<>();
    }

    public void addEntity(Cell cell, Optional<Entity> entity) {
        if(isCellEmpty(cell)) {
            cells.put(cell, entity);
        } else {
            cells.put(cell, Optional.empty());
        }
    }

    public void removeEntity(Cell cell) {
        cells.remove(cell);
        cells.put(cell, Optional.empty());
    }

    public boolean isCellEmpty(Cell cell) {
        if(cell == null) {
            return false;
        }
        return !cells.containsKey(cell);

    }


    public void setCells(Map<Cell, Optional<Entity>> cells) {
        this.cells = cells;
    }

    public Map<Cell, Optional<Entity>> getCells() {
        return cells;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Optional<Entity> getEntity(Cell cell) {
        if(isCellEmpty(cell)) {
            return Optional.empty();
        }
        return cells.get(cell);
    }





}