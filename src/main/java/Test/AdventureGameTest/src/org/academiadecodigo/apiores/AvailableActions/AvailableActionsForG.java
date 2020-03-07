package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;

import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
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
                    System.out.println("There's a hand written G under both of them.\nI wonder what that means...");
                    break;
                } else {
                    System.out.println("You don't have this item.");
                    break;
                }
            case "open wardrobe":
                System.out.println("You found a jacket inside the wardrobe.");
                game.openWardrobe();
                break;
            case "search wardrobe":
                System.out.println("You found a jacket inside the wardrobe.");
                game.openWardrobe();
                break;
            case "use chair":
                if (game.getBag().contains("chair")) {
                    if (game.getBag().contains("envelope")) {
                        System.out.println("There is nothing on top of the wardrobe");
                    } else {
                        System.out.println("You climb into the chair.\nYou found an envelope on top of the wardrobe.");
                        game.updateBag("envelope");
                        return;
                    }
                } else {
                    System.out.println("Nothing interesting happens.");
                    return;
                }
            case "open envelope":
                if (game.getBag().contains("envelope")) {
                    if (!game.getOpenEnvelope()) {
                        System.out.println("There is a handwritten note and a key inside the envelope");
                        game.updateBag("handwritten note");
                        game.updateBag("key");
                        game.openEnvelope();
                        return;
                    } else if (game.getOpenEnvelope()) {
                        System.out.println("The envelope has already been opened.");
                        break;
                    }
                } else {
                    System.out.println("You don't have an envelope.");
                    break;
                }
            case "read newspaper":
                if (game.getBag().contains("newspaper")) {
                    System.out.println("THE END IS NEAR!\n" +
                            "These words may save your life and show you the way to freedom.\n" +
                            "You may, therefore, read them very carefully and take into account\n" +
                            "every single aspect, even if it may look insignificant in the first place.\n" +
                            "Life is quite rich in obstacles and surprises and sometimes\n" +
                            "the right path is in front of our eyes and we can't see it.\n" +
                            "In most situations it's important to keep a crispy mind and\n" +
                            "consider all the possibilities.\n" +
                            "Nothing should be taken for granted and it's good to keep healthy habits\n" +
                            "so that your body can be prepared for any unpredictable circumstances,\n" +
                            "like moving or pushing something that may look hard to move or push.\n" +
                            "The way out to our problems is, sometimes, hidden behind curtains, closets or walls\n" +
                            "and it's important to play our best shot in the right hour, day and year.");
                    return;
                } else {
                    System.out.println("You don't have a newspaper.");
                    break;
                }
            case "read handwritten note":
                if (game.getBag().contains("handwritten note")) {
                    System.out.println("There's a quote from Cecília Meireles:\n'Freedom is a word that the human dream feeds," +
                            "\nwhich needs no one to explain\nand no one who does not understand.'");
                    break;
                } else {
                    System.out.println("You don't have a handwritten note.");
                    break;
                }
            case "use key":
                if (game.getBag().contains("key")) {
                    System.out.println("You cannot use this key here.");
                    break;
                } else {
                    System.out.println("You don't have a key");
                    break;
                }

            case "use can opener":
                if (game.getBag().contains("can opener")) {
                    System.out.println("You need a can to use it with");
                    break;
                } else {
                    System.out.println("You do not have this item");
                    break;
                }
            case "use flip flops":
                if (game.getBag().contains("flip flops")) {
                    System.out.println("No need to use flip flops here.");
                    break;
                } else {
                    System.out.println("You don't have this item.");
                    break;
                }
            case "use golden key":
                if (game.getBag().contains("golden key")) {
                    System.out.println("Not useful in this situation");
                    break;
                } else {
                    System.out.println("You do not have this item");
                    break;
                }

            case "use jacket":
                if (game.getOpenWardrobe()) {
                    System.out.println("Too small for you.\nBut it looks like there's something in it's pocket");
                    break;
                } else {
                    System.out.println("Which Jacket?");
                    break;
                }
            case "search jacket":
                if (game.getOpenWardrobe()) {
                    if (game.getBag().contains("can opener")) {
                        System.out.println("There is nothing special about this jacket.");
                        break;
                    } else {
                        System.out.println("You found a can opener inside the jacket's pocket");
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
            case "open vault":
                if (!game.getPushWadrobe()) {
                    System.out.println("I do not understand.\nPlease press 'i' to check your options.");
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
                    System.out.println("Your bag is Empty.");
                    break;
                } else {
                    System.out.println("Items in your bag:");
                    System.out.println(game.getBag().toString());
                    break;
                }
            case "i":
                System.out.println("\nCOMMANDS:\n\nW - Go West\nN -" +
                        " Go North\nS - Go South\nE - Go East\n\nLook\nCheck Bag\nGet <Item>\nUse <Item>\nOpen <Item>\n" +
                        "Read <Item>\nSearch<Item>\n\nIf you want to check this instructions again, use command i.\n");
                break;
            default:
                System.out.println("I do not understand.\nBe more specific or look again.\nMaybe you'd like to press 'i' to check your options.");
        }
    }
}