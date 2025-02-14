package org.project_simulation.dto;

import org.project_simulation.entitys.Entity;

import java.util.Map;
import java.util.Optional;

public class MapSettings {

    public MapSettings(GameMap map) {

        int x = map.getWidth();
        int y = map.getHeight();
        Map<Cell, Optional<Entity>> cell = map.getCells();
    }




}
