package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
public class AvailableActionsForD {
    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                System.out.println("There are lines on the wall. It looks like they were used to count the weeks. Do you want to count them?");
                break;
            case "get lines":
                System.out.println("You cannot do that!");
            case "yes":
                System.out.println("I can count 6 weeks.");
                break;
            case "no":
                System.out.println("Ok. But maybe you should... Who knows if it's a clue to something.");
            case "use lines":
                System.out.println("You cannot do that!");
                break;
            case "open lines":
                System.out.println("You cannot do that!");
                break;
            case "read lines":
                System.out.println("It would be better to count them.");
                break;
            case "count lines":
                System.out.println("I can count 6 weeks.");
            case "search lines":
                System.out.println("Nothing interesting");
                break;
            default:
                System.out.println("I do not understand. Please press 'i' to check your options.");
        }
    }
}