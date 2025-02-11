package org.project_simulation.actions;

import org.project_simulation.Cell;
import org.project_simulation.GameMap;
import org.project_simulation.entitys.Entity;
import org.project_simulation.entitys.creatures.Herbivore;
import org.project_simulation.entitys.creatures.Predator;
import org.project_simulation.entitys.static_objects.Grass;
import org.project_simulation.entitys.static_objects.Rock;
import org.project_simulation.entitys.static_objects.Tree;

import java.util.Random;

public class InitActions extends Action {

    /**
     * Действия перед стартом симуляции - случайная расстановка всех сущностей
     */

    private final GameMap gameMap;
    private final Random random = new Random();
    private final int SIZE;


    public InitActions(GameMap gameMap) {
        this.gameMap = gameMap;
        this.SIZE = gameMap.getWidth() * gameMap.getHeight();
    }


    public void initGameMap() {



        for (int x = 0; x < SIZE / 9; x++) {
            spawnEntity(new Grass(getRandomCell()));
        }

        for (int x = 0; x < SIZE / 11; x++) {
            spawnEntity(new Rock(getRandomCell()));
        }

        for (int x = 0; x < SIZE / 11; x++) {
            spawnEntity(new Tree(getRandomCell()));
        }

        for (int x = 0; x < gameMap.getWidth(); x++) {
            spawnEntity(new Predator(getRandomCell()));
        }

        for (int x = 0; x < gameMap.getWidth(); x++) {
            spawnEntity(new Herbivore(getRandomCell()));
        }


    }

    private Cell getRandomCell() {
        Cell cell;

        int randomCellX = random.nextInt(gameMap.getWidth());
        int randomCellY = random.nextInt(gameMap.getHeight());

        cell = new Cell(randomCellX, randomCellY);

        return cell;
    }

    private void spawnEntity(Entity entity) {

        Cell cell = getRandomCell();
        int attempts = SIZE;
        while (gameMap.isCellEmpty(cell)) {
            cell = getRandomCell();
            attempts--;
            if (attempts == 0) {
                return;
            }
        }
        gameMap.addEntity(cell, entity);
    }
}

//    private void spawnEntity(Entity entity) {
//
//        Cell cell = getRandomCell();
//
//        for(int x = 0; x < gameMap.getWidth(); x++) {
//            for(int y = 0; y < gameMap.getHeight(); y++) {
//
//                if (entity instanceof Predator predator) {
//                    if (!gameMap.isCellEmpty(cell)){
//                        gameMap.addEntity(cell, predator);
//                    } else {
//                        gameMap.addEntity(cell, new Predator(cell));
//                    }
//
//                } else if (entity instanceof Herbivore herbivore) {
//                    if (!gameMap.isCellEmpty(cell)){
//                        gameMap.addEntity(cell, herbivore);
//                    } else {
//                        gameMap.addEntity(cell, new Herbivore(cell));
//                    }
//
//                } else if (entity instanceof Grass grass) {
//                    if (!gameMap.isCellEmpty(cell)){
//                        gameMap.addEntity(cell, grass);
//                    }
//
//                } else if (entity instanceof Tree tree) {
//                    if (!gameMap.isCellEmpty(cell)){
//                        gameMap.addEntity(cell, tree);
//                    }
//
//                } else if (entity instanceof Rock rock) {
//                    if (!gameMap.isCellEmpty(cell)){
//                        gameMap.addEntity(cell, rock);
//                    }
//
//                }
//            }
//        }
//    }



