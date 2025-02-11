package org.project_simulation.entitys.static_objects;

/**
 * Трава
 */

public class Grass extends Item {
    public Grass(Cell cell) {
        super(cell);
    }

    @Override
    public String toString() {
        return "\uD83C\uDF3F";
    }
}
