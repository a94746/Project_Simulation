package org.project_simulation.DTO;

import org.project_simulation.entitys.Entity;

public class Renderer {

    /**
     * Рендер игровой карты
     */

    private final GameMap gameMap;

    public Renderer(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public void render() {

        Cell cell;
        Entity entity;

        for (int x = 0; x < gameMap.getWidth(); x++) {
            for (int y = 0; y < gameMap.getHeight(); y++) {

                cell = new Cell(x, y);
                entity = gameMap.getEntity(cell);

                StringBuilder line = new StringBuilder((gameMap.isCellEmpty(cell)) ? " " + entity.toString() + " " : " . ");

                System.out.println(line);

            }
        }
    }
}
