package org.project_simulation;

import org.project_simulation.dto.Cell;
import org.project_simulation.dto.GameMap;
import org.project_simulation.dto.Renderer;
import org.project_simulation.actions.InitActions;
import org.project_simulation.entitys.creatures.Predator;
import org.project_simulation.entitys.static_objects.Grass;

import java.lang.ref.PhantomReference;
import java.util.Optional;

public class Main{
    public static void main(String[] args) {

        GameMap gameMap = new GameMap(21);
        gameMap.addEntity(new Cell(1,1), Optional.of(new Grass()));
        Renderer renderer = new Renderer(gameMap);
        renderer.render();







    }
}
