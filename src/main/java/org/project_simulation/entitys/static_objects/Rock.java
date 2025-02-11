package org.project_simulation.entitys.static_objects;

import org.project_simulation.Cell;

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
