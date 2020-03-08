package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Commands.EasterEggs;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Messages;

public class AvailableActionsForB {
    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                System.out.println("There's a sink on the wall.\nYou may wash your hands!");
                break;
            case "wash hands":
            case "drink water":
            case "use sink":
            case "check sink":
                System.out.println("No running water.");
                break;
            case "Get sink":
                System.out.println("We better leave the sink here in case\n" +
                        "Jojó wants to fix it.");
                break;
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
            case "check golden key":
                if (game.getBag().contains("golden key")) {
                    System.out.println(Messages.ACTION_CHECK_GOLDENKEY);
                    break;
                } else {
                    System.out.println(Messages.ACTION_NO_KEY);
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
            case "open sink":
                System.out.println(Messages.ACTION_CANNOT);
                break;
            case "use flip flops":
                if(game.getBag().contains("flip flops")) {
                    System.out.println(Messages.ACTION_NO_NEED_FLIPFLOPS);
                    break;
                }else{
                    System.out.println(Messages.ACTION_NO_ITEM);
                    break;
                }
            case "read sink":
                System.out.println(Messages.ACTION_CANNOT);
                break;
            case "search sink":
                System.out.println(Messages.ACTION_NOTHING_INTERESTING);
                break;
            case "check flip flops":
                if(game.getBag().contains("flip flops")) {
                    System.out.println(Messages.ACTION_FLIPFLOPS_MSG);
                    break;
                }else {
                    System.out.println(Messages.ACTION_NO_ITEM);
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