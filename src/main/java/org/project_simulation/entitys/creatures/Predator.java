package org.project_simulation.entitys.creatures;

public class Predator extends Creature {


    /**
     * Хищное существо
     */

    private int attack;     //сила атаки



    public Predator(Cell cell) {
        super(cell);
        setAttack(1);
        setHealth(15);
        setSpeed(1);
    }

    public int setAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC3A";
    }

    @Override
    public void makeMove() {
        //makeMove or attack

    }


    @Override
    public Cell getCurrentCell() {
        return super.getCurrentCell();
    }
}
