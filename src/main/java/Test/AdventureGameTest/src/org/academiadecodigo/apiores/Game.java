package Test.AdventureGameTest.src.org.academiadecodigo.apiores;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Commands.Directions;
import org.academiadecodigo.apiores.Main;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.InputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.util.HashSet;
import java.util.Set;

public class Game {

    private PlayerPosition playerPosition = new PlayerPosition(2, 2);
    private CellVerification cellVerification = new CellVerification();
    private HashSet<String> bag = new HashSet<String>();
    private boolean pushWadrobe = false;
    private boolean openDoor = false;

    public void init() {

        Prompt prompt = new Prompt(System.in, System.out);
        StringInputScanner usernameInput = new StringInputScanner();
        usernameInput.setMessage("Hello adventurer. What is your name?\n");
        String username = prompt.getUserInput(usernameInput);
        System.out.println(username + " huh?");

        while (true) {
            StringInputScanner commandInput = new StringInputScanner();
            commandInput.setMessage("\nCommand:\n");
            String command = prompt.getUserInput(commandInput).toLowerCase();

            if (Directions.GO_NORTH.getInput().equals(command) || Directions.GO_SOUTH.getInput().equals(command) ||

                    Directions.GO_EAST.getInput().equals(command) ||
                    Directions.GO_WEST.getInput().equals(command)) {
                playerPosition.updatePosition(command);
            } else {
                cellVerification.verify(command, playerPosition, this);
            }
        }
    }


    public void updateBag(String item){
        bag.add(item);
    }

    public  Set<String> getBag(){
        return bag;
    }

    public void pushWardrobe(){
        pushWadrobe = true;
    }

    public boolean getPushWadrobe(){
        return pushWadrobe;
    }

    public void openDoor(){
        openDoor = true;
    }

    public boolean getOpenDoor(){
        return openDoor;
    }
}
