package org.project_simulation;

import org.project_simulation.DTO.GameMap;
import org.project_simulation.DTO.Renderer;
import org.project_simulation.actions.InitActions;

public class Main{
    public static void main(String[] args) {

        GameMap gameMap = new GameMap(21);
        InitActions initActions = new InitActions(gameMap);
        initActions.initGameMap();
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
