package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Commands.EasterEggs;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Messages;

import java.util.concurrent.TimeUnit;

public class AvailableActionsForI {
    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                System.out.println("You are facing the door.\nFreedom is on the other side.");
                break;
            case "get door":
                System.out.println(Messages.ACTION_CANNOT);
                break;
            case "use door":
                System.out.println(Messages.ACTION_CANNOT);
                break;
            case "open door":
            case "unlock door":
                if(game.getOpenDoor()){
                    System.out.println("The door is already open.");
                    break;
                }
                else if (game.getBag().contains("golden key")) {
                    System.out.println("You made it!\nThis is the right key!\nThe door is open!");
                    game.openDoor();
                    break;
                } else {
                    System.out.println("Door is locked.\nYou need the right key to open it.");
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
            case "wank":
                EasterEggs.wank();
                break;
            case "read newspaper":
            case "check newspaper":
            case "use newspaper":
                if (game.getBag().contains("newspaper")) {
                    System.out.println(Messages.ACTION_READ_NEWSPAPER);
                    return;
                } else {
                    System.out.println(Messages.ACTION_NO_NEWSPAPER);
                    break;
                }
            case "use golden key":
                if(game.getOpenDoor()){
                    System.out.println("The door is already open.");
                    break;
                }
                else if (game.getBag().contains("golden key")) {
                    System.out.println("You made it!\nThis is the right key!\nThe door is open!");
                    game.openDoor();
                    return;
                } else {
                    System.out.println(Messages.ACTION_NO_ITEM);
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

            case "use can opener":
                if(game.getBag().contains("can opener")){
                    System.out.println(Messages.ACTION_USE_CANOPENER);
                    break;
                } else {
                    System.out.println(Messages.ACTION_NO_ITEM);
                    break;
                }


            case "go out":
                if (!game.getOpenDoor()) {
                    System.out.println("The door is locked, you can't go outside.");
                    break;
                } else {
                    if (game.getBag().contains("flip flops")) {
                        System.out.println("You are free!\nCongrats! You made it!");
                        game.gameEnd();
                        break;
                    } else {
                        System.out.println("Are you sure you want to step outside on your bare feet?");
                        break;
                    }
                }
            case "use flip flops":
                if(game.getBag().contains("flip flops")) {
                    System.out.println(Messages.ACTION_NO_NEED_FLIPFLOPS);
                    break;
                }else{
                    System.out.println(Messages.ACTION_NO_ITEM);
                    break;
                }

            case "exit":
                if (!game.getOpenDoor()) {
                    System.out.println("The door is locked, you can't go outside.");
                    break;
                } else {
                    if (game.getBag().contains("flip flops")) {
                        System.out.println("You are free!\nCongrats! You made it!");
                        game.gameEnd();
                        break;
                    } else {
                        System.out.println("Are you sure you want to step outside on your bare feet?");
                        break;
                    }
                }
            case "go outside":
                if (!game.getOpenDoor()) {
                    System.out.println("The door is locked, you can't go outside.");
                    break;
                } else {
                    if (game.getBag().contains("flip flops")) {
                        System.out.println("You are free!\nCongrats! You made it!");
                        game.gameEnd();
                        break;
                    } else {
                        System.out.println("Are you sure you want to step outside on your bare feet?");
                        break;
                    }
                }
            case "read door":
                System.out.println(Messages.ACTION_CANNOT);
                break;
            case "search door":
                System.out.println(Messages.ACTION_NOTHING_INTERESTING);
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