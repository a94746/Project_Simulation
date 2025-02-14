package org.project_simulation.actions;

import org.project_simulation.dto.Cell;
import org.project_simulation.dto.GameMap;
import org.project_simulation.dto.MapSettings;

import java.util.Random;

public class GetRandomCell extends InitActions {

    GameMap gameMap;

    @Override
    public GameMap init(MapSettings mapSettings) {
        return null;
    }

public Cell getRandomCell() {

        Random random = new Random();
        int x = random.nextInt(gameMap.getWidth());
        int y = random.nextInt(gameMap.getHeight());

        return new Cell(x, y);
}


}
