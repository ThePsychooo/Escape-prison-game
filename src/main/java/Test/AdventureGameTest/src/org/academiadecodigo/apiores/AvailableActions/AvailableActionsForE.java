package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
public class AvailableActionsForE {
    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                System.out.println("You are in the middle of the room. You may want to move N, E, S, W.");
                break;
            case "get":
                System.out.println("You cannot do that!");
            case "use":
                System.out.println("You cannot do that!");
                break;
            case "open":
                System.out.println("You cannot do that!");
                break;
            case "read":
                System.out.println("You cannot do that!");
                break;
            case "search":
                System.out.println("You cannot do that!");
                break;
            default:
                System.out.println("I do not understand. Please press 'i' to check your options.");
        }
    }
}