package org.project_simulation.dto;

import org.project_simulation.entitys.Entity;
import java.util.Optional;

public class Renderer {

    /**
     * Рендер игровой карты
     */

    private final GameMap gameMap;

    public Renderer(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public void render() {

        for (int x = 0; x < gameMap.getWidth(); x++) {
            StringBuilder line = new StringBuilder();
            for (int y = 0; y < gameMap.getHeight(); y++) {

                Cell cell = new Cell(x, y);
                Optional<Entity> entityOpt = gameMap.getEntity(cell);

                String icon = entityOpt.isPresent() ? entityOpt.get().getIcon() : " . ";
                line.append(" ");
                line.append(icon);
                line.append(" ");
            }
            System.out.println(line);
        }
    }
}