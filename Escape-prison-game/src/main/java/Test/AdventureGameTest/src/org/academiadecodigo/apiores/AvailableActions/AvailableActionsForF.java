package Test.AdventureGameTest.src.org.academiadecodigo.apiores.AvailableActions;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Commands.EasterEggs;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Game;
public class AvailableActionsForF {
    public static void checkActions(String command, Game game) {
        switch (command) {
            case "look":
                if (game.getBag().contains("flip flops")) {
                    System.out.println("Nothing interesting in front of you.");
                    break;
                } else {
                    System.out.println("There's a pair of flip flops on the floor.\nI wonder if it's your number...");
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

            case "open envelope":
                if (game.getBag().contains("envelope")) {
                    if (!game.getOpenEnvelope()) {
                        System.out.println("There is a handwritten note and a key inside the envelope");
                        game.updateBag("handwritten note");
                        game.updateBag("key");
                        game.openEnvelope();
                        return;
                    }else if(game.getOpenEnvelope()){
                        System.out.println("The envelope has already been opened.");
                        break;
                    }
                }   else {
                    System.out.println("You don't have an envelope.");
                    break;
                }
            case "read handwritten note":
                if(game.getBag().contains("handwritten note")){
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

            case "use can opener":
                if(game.getBag().contains("can opener")){
                    System.out.println("You need a can to use it with");
                    break;
                } else {
                    System.out.println("You do not have this item");
                    break;
                }
            case "use golden key":
                if(game.getBag().contains("golden key")){
                    System.out.println("Not useful in this situation");
                    break;
                } else {
                    System.out.println("You do not have this item");
                    break;
                }

            case "use flip flops":
            case "try flip flops":
                System.out.println("No need to use flip flops here.");
                break;
            case "open flip flops":
                System.out.println("You cannot do that!");
                break;
            case "read flip flops":
                System.out.println("You cannot do that!");
                break;
            case "check flip flops":
                System.out.println("There's a hand written G under both of them.\nI wonder what that means...");
                break;
            case "check bag":
                if(game.getBag().isEmpty()){
                    System.out.println("Your bag is Empty.");
                    break;
                } else {
                    System.out.println("Items in your bag:");
                    System.out.println(game.getBag().toString());
                    break;
                }
            case "wank":
                EasterEggs.wank();
                break;
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