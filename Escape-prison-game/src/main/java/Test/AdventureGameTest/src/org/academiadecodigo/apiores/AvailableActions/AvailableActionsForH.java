package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Commands.EasterEggs;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Messages;

import java.util.concurrent.TimeUnit;

public class AvailableActionsForH {
    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                System.out.println("There's a mattress on the floor.");
                break;
            case "get mattress":
                System.out.println("Why would you want to get a mattress?\nMaybe you want to search it instead...");
                break;
            case "use mattress":
            case "sleep":
            case "lay down":
            case "take a nap":
                System.out.println("Do you want to take a nap now?\nYou must get out of this place, remember?");
                break;
            case "open mattress":
                System.out.println(Messages.ACTION_CANNOT);
                break;
            case "read mattress":
                System.out.println(Messages.ACTION_CANNOT);
                break;
            case "check flip flops":
                if(game.getBag().contains("flip flops")) {
                    System.out.println(Messages.ACTION_FLIPFLOPS_MSG);
                    break;
                }else {
                    System.out.println(Messages.ACTION_NO_ITEM);
                    break;
                }
            case "search mattress":
            case "check mattress":
                if(game.getBag().contains("newspaper")){
                    System.out.println("There is nothing else on the mattress.");
                    break;
                }else {
                    System.out.println("Interesting... you found an old newspaper from the future under it.\n" +
                            "You put the newspaper inside the bag.");
                    game.updateBag("newspaper");
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
            case "use flip flops":
                if(game.getBag().contains("flip flops")) {
                    System.out.println(Messages.ACTION_NO_NEED_FLIPFLOPS);
                    break;
                }else{
                    System.out.println(Messages.ACTION_NO_ITEM);
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
            case "wank":
                EasterEggs.wank();
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
            case "i":
                System.out.println(Messages.GAME_COMMANDS);
                break;
            default:
                System.out.println(Messages.ACTION_NOT_UNDERSTAND);
        }
    }
}