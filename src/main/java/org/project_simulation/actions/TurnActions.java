package org.project_simulation.actions;


import org.project_simulation.Cell;
import org.project_simulation.GameMap;
import org.project_simulation.entitys.creatures.Creature;

public class TurnActions < K extends Creature >  extends Action{

    GameMap gameMap;

    public TurnActions(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public void move(Creature creature, Cell target) {


        Cell currentCell = creature.getCurrentCell();
        if(!gameMap.isCellEmpty(currentCell)) {
            gameMap.addEntity(target, creature);
        }
    }
}

