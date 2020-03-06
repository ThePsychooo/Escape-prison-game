package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;

public class AvailableActionsForC {
    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                System.out.println("There's a calendar on the wall");
                break;
            case "get calendar":
                System.out.println("There's nothing to get");
                break;
            case "use calendar":
                System.out.println("Do you want to read what's in the calendar?");
                break;
            case "yes":
                System.out.println("It's a calendar from April 2020. There's a red circle around day 17. I wonder what will happen in that day...");
                break;
            case "no":
                System.out.println("Ok. But maybe you should... It's always good to know what day it is today.");
                break;
            case "open calendar":
                System.out.println("You cannot do that!");
                break;
            case "read calendar":
                System.out.println("It's a calendar from April 2020. There's a red circle around day 17. I wonder what will happen in that day...");
                break;
            case "search calendar":
                System.out.println("Nothing interesting");
                break;
            default:
                System.out.println("I do not understand. Please press 'i' to check your options.");
        }
    }
}