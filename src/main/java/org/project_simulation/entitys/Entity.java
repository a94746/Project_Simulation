package org.project_simulation.entitys;

import org.project_simulation.Cell;

abstract public class Entity {

    /**
     * Сущность
     */

    private Cell cell;

    public Entity(Cell cell) {
        this.cell = cell;
    }

    public Cell getCurrentCell(){
        return cell;
    }



}
