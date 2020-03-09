package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;

import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Commands.EasterEggs;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Messages;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;

import java.util.HashSet;

public class AvailableActionsForG {
    public static void checkActions(String command, Game game) {
        boolean pushedWardrobe = false;
        switch (command) {
            case "look":
                if (!game.getPushWadrobe()) {
                    if (game.getBag().contains("can opener")) {
                        System.out.println("There's an old wardrobe in front of you.");
                        break;
                    } else if (!(game.getBag().contains("can opener"))) {
                        System.out.println("There's an old wardrobe in front of you.\nMaybe there's something inside.");
                        return;
                    }
                } else {
                    System.out.println("There's an old wardrobe in front of you and a vault behind it.");
                    return;
                }
            case "check flip flops":
                if (game.getBag().contains("flip flops")) {
                    System.out.println(Messages.ACTION_FLIPFLOPS_MSG);
                    break;
                } else {
                    System.out.println(Messages.ACTION_NO_ITEM);
                    break;
                }
            case "check wardrobe":
            case "open wardrobe":
            case "search wardrobe":
                System.out.println("You found a jacket inside the wardrobe.");
                game.openWardrobe();
                break;
            case "use chair":
                if (game.getBag().contains("chair")) {
                    if (game.getBag().contains("envelope")) {
                        System.out.println("There is nothing on top of the wardrobe.");
                        break;
                    } else {
                        System.out.println("You climbed up on the chair.\nYou found an envelope on top of the wardrobe.\n" +
                                "You put it inside your bag.");
                        game.updateBag("envelope");
                        return;
                    }
                } else {
                    System.out.println("Nothing interesting happens.");
                    return;
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
                    } else if (game.getOpenEnvelope()) {
                        System.out.println(Messages.ACTION_OPENED_ENVELOPE);
                        break;
                    }
                } else {
                    System.out.println(Messages.ACTION_NO_ENVELOPE);
                    break;
                }
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
                if (game.getBag().contains("handwritten note")) {
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
                if (game.getBag().contains("can opener")) {
                    System.out.println(Messages.ACTION_USE_CANOPENER);
                    break;
                } else {
                    System.out.println(Messages.ACTION_NO_ITEM);
                    break;
                }
            case "use flip flops":
                if (game.getBag().contains("flip flops")) {
                    System.out.println(Messages.ACTION_NO_NEED_FLIPFLOPS);
                    break;
                } else {
                    System.out.println(Messages.ACTION_NO_ITEM);
                    break;
                }
            case "use golden key":
                if (game.getBag().contains("golden key")) {
                    System.out.println(Messages.ACTION_GOLDKEY_MSG);
                    break;
                } else {
                    System.out.println(Messages.ACTION_NO_ITEM);
                    break;
                }

            case "use jacket":
            case "check jacket":
                if (game.getOpenWardrobe()) {
                    System.out.println("Too small for you.\nBut it looks like there's something inside its pocket.");
                    break;
                } else {
                    System.out.println("Which jacket?");
                    break;
                }
            case "get jacket":
                if (game.getOpenWardrobe()) {
                    System.out.println("Too small for you.\nBut it looks like there's something inside its pocket.");
                    break;
                } else {
                    System.out.println("Which jacket?");
                    break;
                }
            case "search pocket":
            case "check pocket":
            case "search jacket":
            case "check pockets":
            case "search pockets":
                if (game.getOpenWardrobe()) {
                    if (game.getBag().contains("can opener")) {
                        System.out.println("There is nothing special about this jacket.");
                        break;
                    } else {
                        System.out.println("You found a can opener inside the jacket's pocket.");
                        game.getBag().add("can opener");
                        break;
                    }
                } else {
                    System.out.println("Which Jacket?");
                    break;
                }

            case "push wardrobe":
                if (!game.getPushWadrobe()) {
                    System.out.println("You push the wardrobe.\nThere is a vault behind it!");
                    game.pushWardrobe();
                    return;
                } else {
                    System.out.println("You already pushed the wardrobe.");
                    return;
                }
            case "move wardrobe":
                if (!game.getPushWadrobe()) {
                    System.out.println("You push the wardrobe.\nThere is a vault behind it!");
                    game.pushWardrobe();
                    return;
                } else {
                    System.out.println("You already pushed the wardrobe.");
                    return;
                }
            case "search vault":
            case "check vault":
            case "open vault":
                if (!game.getPushWadrobe()) {
                    System.out.println(Messages.ACTION_NOT_UNDERSTAND);
                    return;
                } else {
                    if (game.getOpenVault()) {
                        System.out.println("The vault has already been opened.");
                        break;
                    } else {
                        Prompt prompt = new Prompt(System.in, System.out);
                        IntegerInputScanner codeInput = new IntegerInputScanner();
                        codeInput.setMessage("Insert the code for the vault (6 digits):\n");
                        int code = prompt.getUserInput(codeInput);
                        if (code == 170420) {
                            System.out.println("The vault is now open and you found a golden key inside it!");
                            game.updateBag("golden key");
                            game.openVault();
                            break;
                        } else {
                            System.out.println("The code is invalid.");
                            return;
                        }
                    }
                }
            case "check bag":
                if (game.getBag().isEmpty()) {
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