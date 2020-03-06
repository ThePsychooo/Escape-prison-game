package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;

import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;

import java.util.HashSet;

public class AvailableActionsForA {

    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                if (game.getBag().contains("chair")) {
                    System.out.println("Nothing interesting in front of you.");
                } else {
                    System.out.println("There's an old chair in front of you.");
                    break;
                }
            case "get chair":
                if (game.getBag().contains("chair")) {
                    System.out.println("There's nothing to get");
                    return;
                } else {
                    System.out.println("You got the chair.");
                    game.updateBag("chair");
                    break;
                }
            case "use chair":
                System.out.println("It's nice to get a good rest.");
                break;
            case "open chair":
                System.out.println("You cannot do that!");
                break;
            case "read chair":
                System.out.println("You cannot do that!");
                break;
            case "search chair":
                System.out.println("Nothing interesting");
                break;
            default:
                System.out.println("I do not understand. Please press 'i' to check your options.");
        }
    }
}
