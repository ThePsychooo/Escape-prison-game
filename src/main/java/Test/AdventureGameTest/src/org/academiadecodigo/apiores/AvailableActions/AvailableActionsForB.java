package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
public class AvailableActionsForB {
    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                System.out.println("There's a sink in the wall. You may wash your hands!");
                break;
            case "wash hands":
                System.out.println("No running water.");
                break;
            case "use sink":
                System.out.println("No running water.");
                break;
            case "open sink":
                System.out.println("You cannot do that!");
                break;
            case "read sink":
                System.out.println("You cannot do that!");
                break;
            case "search sink":
                System.out.println("Nothing interesting");
                break;
            default:
                System.out.println("I do not understand. Please press 'i' to check your options.");
        }
    }
}