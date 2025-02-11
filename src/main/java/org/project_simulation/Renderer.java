package org.project_simulation;

import org.project_simulation.entitys.Entity;

public class Renderer {

    /**
     * Рендер игровой карты
     */

    private final GameMap gameMap;

    Renderer(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public void render() {

        Cell cell;
        Entity entity;

        for (int x = 0; x < gameMap.getWidth(); x++) {
            for (int y = 0; y < gameMap.getHeight(); y++) {

                cell = new Cell(x, y);
                entity = gameMap.getEntity(cell);

                String line = (gameMap.isCellEmpty(cell)) ? " " + entity.toString() + " " : " . " ;

                System.out.print(line);

            }
            System.out.println();
        }
    }
}
