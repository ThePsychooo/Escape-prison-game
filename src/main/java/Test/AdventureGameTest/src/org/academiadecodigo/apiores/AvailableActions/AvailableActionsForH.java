package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
public class AvailableActionsForH {
    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                System.out.println("There's a mattress on the floor.");
                break;
            case "get mattress":
                System.out.println("Why would you want to get a mattress? \n Maybe you want to search it instead...");
                break;
            case "use mattress":
                System.out.println("Do you want to take a nap now? \n You must get out of this place, remember?");
                break;
            case "open mattress":
                System.out.println("You cannot do that!");
                break;
            case "read mattress":
                System.out.println("You cannot do that!");
                break;
            case "search mattress":
                System.out.println("Interesting... you found an old paper from the future under it.");
                game.updateBag("newspaper");
                break;
            case "read newspaper":
                if (game.getBag().contains("newspaper")) {
                    System.out.println("Textão com pistas (saída está no armário - empurrar armário");
                    return;
                } else {
                    System.out.println("You don't have a newspaper.");
                    break;
                }
            default:
                System.out.println("I do not understand. Please press 'i' to check your options.");
        }
    }
}