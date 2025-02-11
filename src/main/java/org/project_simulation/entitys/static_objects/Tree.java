package org.project_simulation.entitys.static_objects;

/**
 * Дерево
 */


public class Tree extends Item {
    public Tree(Cell cell) {
        super(cell);
    }

    @Override
    public String toString() {
        return "\uD83C\uDF32";
    }
}
