package org.project_simulation.entitys.static_objects;

/**
 * Камень
 */

public class Rock extends Item {
    public Rock(Cell cell) {
        super(cell);
    }

    @Override
    public String toString() {
        return "⛰️";
    }
}
