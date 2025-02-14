package org.project_simulation.actions;

import org.project_simulation.dto.Cell;
import org.project_simulation.dto.GameMap;
import org.project_simulation.dto.MapSettings;
import org.project_simulation.entitys.Entity;

import java.util.Optional;

public class SpawnEntity extends InitActions {

    GameMap gameMap;
    Entity entity;

    public SpawnEntity(GameMap gameMap, Entity entity) {
        this.gameMap = gameMap;
        this.entity = entity;
    }

    @Override
    public GameMap init(MapSettings mapSettings) {

        return null;
    }

    public void spawnEntity(GameMap gameMap, Cell cell) {
        if(!gameMap.isCellEmpty(cell)){
            gameMap.addEntity(cell, Optional.of(entity));
        } else {

        }
    }
}
