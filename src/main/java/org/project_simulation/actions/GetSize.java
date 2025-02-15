package org.project_simulation.actions;


import org.project_simulation.dto.GameMap;
import org.project_simulation.dto.MapSettings;

public class GetSize extends InitActions {

    /**
     * Действия перед началом игры
     */

    private final GameMap gameMap;

    private final int tileSize = getSize();

    public GetSize(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    @Override
    public GameMap init(MapSettings mapSettings) {
        return gameMap;
    }

    public int getSize() {
        return gameMap.getWidth() * gameMap.getHeight();
    }
}
