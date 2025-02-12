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
//        InitActions initActions = new InitActions(gameMap);
//        initActions.initGameMap();

        gameMap.addEntity(new Cell(1,1), Optional.of(new Grass()));
        Renderer renderer = new Renderer(gameMap);
        renderer.render();

//        int count1 = 0;
//        int count2 = 0;
//        int count3 = 0;
//        int count4 = 0;
//        int count5 = 0;
//        for (Entity c : gameMap.getEntities().values()) {
//            if (c instanceof Grass) {
//                count1++;
//            }
//            else if (c instanceof Tree){
//                count2++;
//            } else if (c instanceof Rock){
//                count3++;
//            } else if (c instanceof Herbivore){
//                count4++;
//            } else if (c instanceof Predator){
//                count5++;
//            }
//        }
//        System.out.println(count1 + " Grass " + count2 + "  Tree " + count3 + " Herbivore " + count4 + " Predator " + count5);
//        System.out.println( count5 + count1 + count2 + count3 + count4  );








    }
}
