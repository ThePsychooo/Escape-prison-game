package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
public class AvailableActionsForI {
    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                System.out.println("You are facing at the door.\nFreedom is on the other side.");
                break;
            case "get door":
                System.out.println("You cannot do that");
                break;
            case "use door":
                System.out.println("You cannot do that");
                break;
            case "open door":
                if (game.getBag().contains("gold key")) {
                    System.out.println("You made it!\nThis is the right key!\nThe door is open!");
                    return;
                } else {
                    System.out.println("Door is locked.\nYou need a key to open it.");
                    break;
                }
            case "go out":
                if (!game.getOpenDoor()) {
                    System.out.println("The door is locked, you can't go outside.");
                } else {
                    if (game.getBag().contains("flip flops")) {
                        System.out.println("You are free!\nCongrats! You made it!");
                    } else {
                        System.out.println("Are you sure you want to step outside on your bare feet?");
                    }
                }
            case "exit":
                if (!game.getOpenDoor()) {
                    System.out.println("The door is locked, you can't go outside.");
                } else {
                    if (game.getBag().contains("flip flops")) {
                        System.out.println("You are free!\nCongrats! You made it!");
                    } else {
                        System.out.println("Are you sure you want to step outside on your bare feet?");
                    }
                }
            case "go outside":
                if (!game.getOpenDoor()) {
                    System.out.println("The door is locked, you can't go outside.");
                } else {
                    if (game.getBag().contains("flip flops")) {
                        System.out.println("You are free!\nCongrats! You made it!");
                    } else {
                        System.out.println("Are you sure you want to step outside on your bare feet?");
                    }
                }
            case "read door":
                System.out.println("You cannot do that!");
                break;
            case "search door":
                System.out.println("Nothing interesting");
                break;
            default:
                System.out.println("I do not understand. Please press 'i' to check your options.");
        }
    }
}