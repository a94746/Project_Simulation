package org.project_simulation.actions;

import org.project_simulation.dto.GameMap;
import org.project_simulation.dto.MapSettings;

abstract public class InitActions {

    /**
     * Действия перед стартом симуляции - случайная расстановка всех сущностей
     */

    abstract public GameMap init(MapSettings mapSettings);
}


