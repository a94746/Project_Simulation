package org.project_simulation.actions;

import org.project_simulation.dto.Cell;
import org.project_simulation.dto.GameMap;
import org.project_simulation.dto.MapSettings;

import java.util.Random;

public class GetRandomCell extends InitActions {

    /**
     * Возвращает случайную клетку
     */

    GameMap gameMap;
    Cell cell;

    @Override
    public GameMap init(MapSettings mapSettings) {


        Random random = new Random();

        int x = random.nextInt(mapSettings.getWidth());
        int y = random.nextInt(mapSettings.getHeight());

        return null;
    }




}
