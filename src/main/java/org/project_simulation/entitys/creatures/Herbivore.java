package org.project_simulation.entitys.creatures;

public class Herbivore extends Creature {

    /**
     * Травоядное существо
     */



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
    public void makeMove() {
        //eatGrass or moveToGrass
    }

    @Override
    public String getIcon() {
        return "\uD83D\uDC16";
    }
}
