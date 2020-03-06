package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;

import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;

import java.util.HashSet;

public class AvailableActionsForG {

    public static void checkActions(String command, Game game) {

        boolean pushedWardrobe = false;

        switch (command) {

            case "look":
                if (!game.getPushWadrobe()) {
                    System.out.println("There's an old wardrobe in front of you. Maybe there's something inside it.");
                    return;
                }else{
                    System.out.println("There's an old wardrobe in front of you with a vault behind it.");
                    return;
                }
            case "use chair":
                if (game.getBag().contains("chair")) {
                    System.out.println("You climb into the chair. You find an envelope that is at the top of the wardrobe.");
                    game.updateBag("envelope");
                    return;
                }   else {
                    System.out.println("Nothing interesting happens.");
                    return;
                }
                case "open wardrobe":
                    if (game.getBag().contains("jacket")) {
                        System.out.println("There is nothing inside the wardrobe.");
                        return;
                    }   else {
                        System.out.println("You find a jacket inside the wardrobe.");
                        game.updateBag("jacket");
                        break;
                    }
                case "push wardrobe":
                    if (!game.getPushWadrobe()){
                        System.out.println("You push the wardrobe. There is a vault behind it!");
                        game.pushWardrobe();
                        return;
                    } else {
                        System.out.println("You already pushed the wardrobe.");
                        return;
                    }

            case "open vault":
                if(!game.getPushWadrobe()){
                     System.out.println("I do not understand. Please press 'i' to check your options.");
                     return;
                }else {
                    Prompt prompt = new Prompt(System.in, System.out);
                    IntegerInputScanner codeInput = new IntegerInputScanner();
                    codeInput.setMessage("Insert the code for the vault:\n");
                    int code = prompt.getUserInput(codeInput);
                    if (code == 170420) {
                        System.out.println("You open the vault and you find a gold key inside it!");
                        game.updateBag("gold key");
                    } else {
                        System.out.println("The code is invalid.");
                        return;
                    }
                }
                 default:                                                                                
                     System.out.println("I do not understand. Please press 'i' to check your options.");

        }
    }
}
