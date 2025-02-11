package org.project_simulation.entitys.creatures;

import org.project_simulation.Cell;
import org.project_simulation.GameMap;
import org.project_simulation.actions.TurnActions;

public class Herbivore extends Creature {

    /**
     * Травоядное существо
     */

    public Herbivore(Cell cell) {
        super(cell);
        setHealth(15);
        setSpeed(1);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC16";
    }

    @Override
    public void makeMove() {
        //eatGrass or moveToGrass

    }




    @Override
    public Cell getCurrentCell() {
        return super.getCurrentCell();
    }
}
