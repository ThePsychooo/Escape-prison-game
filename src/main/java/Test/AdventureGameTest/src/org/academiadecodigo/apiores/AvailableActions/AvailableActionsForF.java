package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
public class AvailableActionsForF {
    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                if (game.getBag().contains("flip flops")) {
                    System.out.println("Nothing interesting in front of you.");
                } else {
                    System.out.println("There's a pair of flip flops in the floor. I wonder if it's your number...");
                    break;
                }
            case "get flip flops":
                if (game.getBag().contains("flip flops")) {
                    System.out.println("There's nothing to get");
                    return;
                } else {
                    System.out.println("You got the flip flops");
                    game.updateBag("flip flops");
                    break;
                }
            case "use flip flops":
                System.out.println("No need to use flip flops here.");
                break;
            case "open flip flops":
                System.out.println("You cannot do that!");
                break;
            case "read flip flops":
                System.out.println("You cannot do that!");
                break;
            case "search flip flops":
                System.out.println("There's a hand written G under both of them. I wonder what that means...");
                break;
            default:
                System.out.println("I do not understand. Please press 'i' to check your options.");
        }
    }
}