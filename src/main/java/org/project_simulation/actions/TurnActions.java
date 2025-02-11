package org.project_simulation.actions;


import org.project_simulation.DTO.Cell;
import org.project_simulation.DTO.GameMap;
import org.project_simulation.entitys.creatures.Creature;

public class TurnActions < K extends Creature >  extends Action{

    private final GameMap gameMap;

    public TurnActions(GameMap gameMap) {
        this.gameMap = gameMap;
    }

}

