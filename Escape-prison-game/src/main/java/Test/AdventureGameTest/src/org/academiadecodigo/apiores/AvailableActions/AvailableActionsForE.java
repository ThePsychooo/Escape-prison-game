package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Commands.EasterEggs;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Messages;

public class AvailableActionsForE {
    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                System.out.println("You are in the middle of the room.\nYou may want to move N, E, S, W.");
                break;
            case "get":
                System.out.println(Messages.ACTION_CANNOT);
            case "use":
                System.out.println(Messages.ACTION_CANNOT);
                break;
            case "open":
                System.out.println(Messages.ACTION_CANNOT);
                break;
            case "read":
                System.out.println(Messages.ACTION_CANNOT);
                break;
            case "search":
                System.out.println(Messages.ACTION_CANNOT);
                break;
            case "open envelope":
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
            case "check flip flops":
                if(game.getBag().contains("flip flops")) {
                    System.out.println(Messages.ACTION_FLIPFLOPS_MSG);
                    break;
                }else {
                    System.out.println(Messages.ACTION_NO_ITEM);
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
            case "use flip flops":
                if(game.getBag().contains("flip flops")) {
                    System.out.println(Messages.ACTION_NO_NEED_FLIPFLOPS);
                    break;
                }else{
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