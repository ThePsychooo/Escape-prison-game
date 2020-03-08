package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Commands.EasterEggs;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Messages;

public class AvailableActionsForF {
    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                if (game.getBag().contains("flip flops")) {
                    System.out.println(Messages.ACTION_NOTHING_INTERESTING_FRONT);
                    break;
                } else {
                    System.out.println("There's a pair of flip flops on the floor.\nI wonder if they fit...");
                    break;
                }
            case "get flip flops":
                if (game.getBag().contains("flip flops")) {
                    System.out.println(Messages.ACTION_NOTHING_GET);
                    return;
                } else {
                    System.out.println("You got the flip flops.\nYou put them inside your bag.");
                    game.updateBag("flip flops");
                    break;
                }

            case "open envelope":
            case "check envelope":
                if (game.getBag().contains("envelope")) {
                    if (!game.getOpenEnvelope()) {
                        System.out.println(Messages.ACTION_OPEN_ENVELOPE);
                        game.updateBag("handwritten note");
                        game.updateBag("key");
                        game.openEnvelope();
                        return;
                    }else if(game.getOpenEnvelope()){
                        System.out.println(Messages.ACTION_OPENED_ENVELOPE);
                        break;
                    }
                }   else {
                    System.out.println(Messages.ACTION_NO_ENVELOPE);
                    break;
                }
            case "read handwritten note":
                if(game.getBag().contains("handwritten note")){
                    System.out.println(Messages.ACTION_READ_NOTE);
                    break;
                } else {
                    System.out.println(Messages.ACTION_NO_NOTE);
                    break;
                }
            case "use key":
                if (game.getBag().contains("key")) {
                    System.out.println(Messages.ACTION_CANT_USE_KEY);
                    break;
                } else {
                    System.out.println(Messages.ACTION_NO_KEY);
                    break;
                }
            case "search flip flops":
                System.out.println("There is nothing inside the flip flops.");
                break;
            case "check key":
                if (game.getBag().contains("key")) {
                    System.out.println("It's just an old key.");
                    break;
                } else {
                    System.out.println(Messages.ACTION_NO_KEY);
                    break;
                }
            case "check golden key":
                if (game.getBag().contains("golden key")) {
                    System.out.println(Messages.ACTION_CHECK_GOLDENKEY);
                    break;
                } else {
                    System.out.println(Messages.ACTION_NO_KEY);
                    break;
                }

            case "read newspaper":
                if (game.getBag().contains("newspaper")) {
                    System.out.println(Messages.ACTION_READ_NEWSPAPER);
                    return;
                } else {
                    System.out.println(Messages.ACTION_NO_NEWSPAPER);
                    break;
                }

            case "use can opener":
                if(game.getBag().contains("can opener")){
                    System.out.println(Messages.ACTION_USE_CANOPENER);
                    break;
                } else {
                    System.out.println(Messages.ACTION_NO_ITEM);
                    break;
                }
            case "use golden key":
                if(game.getBag().contains("golden key")){
                    System.out.println(Messages.ACTION_GOLDKEY_MSG);
                    break;
                } else {
                    System.out.println(Messages.ACTION_NO_ITEM);
                    break;
                }

            case "use flip flops":
            case "try flip flops":
                System.out.println(Messages.ACTION_NO_NEED_FLIPFLOPS);
                break;
            case "open flip flops":
                System.out.println(Messages.ACTION_CANNOT);
                break;
            case "read flip flops":
                System.out.println(Messages.ACTION_CANNOT);
                break;
            case "check flip flops":
                System.out.println(Messages.ACTION_FLIPFLOPS_MSG);
                break;
            case "check bag":
                if(game.getBag().isEmpty()){
                    System.out.println(Messages.ACTION_BAG_EMPTY);
                    break;
                } else {
                    System.out.println(Messages.ACTION_BAG_ITEMS);
                    System.out.println(game.getBag().toString());
                    break;
                }
            case "wank":
                EasterEggs.wank();
                break;
            case "i":
                System.out.println(Messages.GAME_COMMANDS);
                break;
            default:
                System.out.println(Messages.ACTION_NOT_UNDERSTAND);
        }
    }
}