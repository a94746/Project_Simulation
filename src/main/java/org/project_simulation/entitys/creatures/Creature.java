package org.project_simulation.entitys.creatures;

import org.project_simulation.Cell;
import org.project_simulation.entitys.Entity;

abstract public class Creature extends Entity {

    /**
     * Существо
     */


    private int health;

    private int speed;

    public Creature(Cell cell) {
        super(cell);
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealth() {
        return health;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public Cell getCurrentCell() {
        return super.getCurrentCell();
    }

    abstract public void makeMove();

}
