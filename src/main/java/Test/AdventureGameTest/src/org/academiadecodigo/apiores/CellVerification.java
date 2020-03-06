package Test.AdventureGameTest.src.org.academiadecodigo.apiores;

import Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions.AvailableActionsForA;

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
    }

}
