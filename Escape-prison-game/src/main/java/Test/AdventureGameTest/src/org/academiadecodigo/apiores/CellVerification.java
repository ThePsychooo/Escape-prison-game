package Test.AdventureGameTest.src.org.academiadecodigo.apiores;

import Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions.*;

import java.util.HashSet;

public class CellVerification {

    private int currentWidth;
    private int currentHeight;


    public void verify(String command, PlayerPosition playerPosition, Game game) {
        this.currentWidth = playerPosition.getCurrentWidth();
        this.currentHeight = playerPosition.getCurrentHeight();


        if (currentWidth == 1 && currentHeight == 1){
            AvailableActionsForA.checkActions(command, game);
        }

        if (currentWidth == 2 && currentHeight == 1){
            AvailableActionsForB.checkActions(command, game);
        }
        if (currentWidth == 3 && currentHeight == 1){
            AvailableActionsForC.checkActions(command, game);
        }

        if (currentWidth == 1 && currentHeight == 2){
            AvailableActionsForD.checkActions(command, game);
        }

        if (currentWidth == 2 && currentHeight == 2){
            AvailableActionsForE.checkActions(command, game);
        }
        if (currentWidth == 3 && currentHeight == 2){
            AvailableActionsForF.checkActions(command, game);
        }
        if (currentWidth == 1 && currentHeight == 3){
            AvailableActionsForG.checkActions(command, game);
        }

        if (currentWidth == 2 && currentHeight == 3){
            AvailableActionsForH.checkActions(command, game);
        }
        if (currentWidth == 3 && currentHeight == 3){
            AvailableActionsForI.checkActions(command, game);
        }
    }

}
