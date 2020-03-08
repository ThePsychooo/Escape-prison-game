package Test.AdventureGameTest.src.org.academiadecodigo.apiores;

import java.util.concurrent.TimeUnit;

public class Messages {


    public final static String GAME_TITLE = "\n" +
            "▓█████   ██████  ▄████▄   ▄▄▄       ██▓███  ▓█████     ██▀███   ▒█████   ▒█████   ███▄ ▄███▓\n" +
            "▓█   ▀ ▒██    ▒ ▒██▀ ▀█  ▒████▄    ▓██░  ██▒▓█   ▀    ▓██ ▒ ██▒▒██▒  ██▒▒██▒  ██▒▓██▒▀█▀ ██▒\n" +
            "▒███   ░ ▓██▄   ▒▓█    ▄ ▒██  ▀█▄  ▓██░ ██▓▒▒███      ▓██ ░▄█ ▒▒██░  ██▒▒██░  ██▒▓██    ▓██░\n" +
            "▒▓█  ▄   ▒   ██▒▒▓▓▄ ▄██▒░██▄▄▄▄██ ▒██▄█▓▒ ▒▒▓█  ▄    ▒██▀▀█▄  ▒██   ██░▒██   ██░▒██    ▒██ \n" +
            "░▒████▒▒██████▒▒▒ ▓███▀ ░ ▓█   ▓██▒▒██▒ ░  ░░▒████▒   ░██▓ ▒██▒░ ████▓▒░░ ████▓▒░▒██▒   ░██▒\n" +
            "░░ ▒░ ░▒ ▒▓▒ ▒ ░░ ░▒ ▒  ░ ▒▒   ▓▒█░▒▓▒░ ░  ░░░ ▒░ ░   ░ ▒▓ ░▒▓░░ ▒░▒░▒░ ░ ▒░▒░▒░ ░ ▒░   ░  ░\n" +
            " ░ ░  ░░ ░▒  ░ ░  ░  ▒     ▒   ▒▒ ░░▒ ░      ░ ░  ░     ░▒ ░ ▒░  ░ ▒ ▒░   ░ ▒ ▒░ ░  ░      ░\n" +
            "   ░   ░  ░  ░  ░          ░   ▒   ░░          ░        ░░   ░ ░ ░ ░ ▒  ░ ░ ░ ▒  ░      ░   \n" +
            "   ░  ░      ░  ░ ░            ░  ░            ░  ░      ░         ░ ░      ░ ░         ░   \n" +
            "                ░                                                                           \n";

    public final static String GAME_WELCOME = "Welcome to the most amazing text adventure game!\n" +
            "For some unknown reason you are locked inside a room.\n" +
            "You feel dizzy, you can't remember your name\n" +
            "and you are not sure how long you've been in captivity.\n" +
            "You must escape the room but there's something else you gotta know:\n" +
            "There's another room in front with another player in the exact same situation.\n" +
            "The first player escaping the room wins the game.\n" +
            "Use your time wisely and escape the room as fast as you can!";

    public final static String GAME_COMMANDS = "\nCOMMANDS:\n\nW - Go West\nN -" +
            " Go North\nS - Go South\nE - Go East\n\nLook\nCheck Bag\nGet <Item>\nUse <Item>\nOpen <Item>\n" +
            "Read <Item>\nSearch <Item>\n\nThere might be some other hidden commands that you need to use\nin order to progress in the game.\nIf you want to check these instructions again, use command 'i'.\n";

    public final static String GAME_USERNAME = "The game is about to start. How do you want to be called, prisoner?\n";

    public final static String GAME_USERNAME_JOJO = "Jojo? I once had an MC with that name. I prefer not to remember those days...";

    public final static String GAME_USERNAME_SORAIA = "Soraia? I once had an MC with that name. Maybe she could explain how this game works.";

    public final static String GAME_USERNAME_RITA = "Rita? I once had an MC with that name. She was crazy about pineapples!";

    public final static String GAME_USERNAME_RICARDO = "Ricardo? I once had an MC with that name. I bet he would complain about this game's design!";

    public final static String GAME_USERNAME_XAVIER = "Xavier? I remember meeting a guy with that name who had the best taste in music.\n" +
            "He is usually seen waiting for someone to open whatever door he wants to enter.";

    public final static String GAME_USERNAME_FRANCISCO = "Francisco? I once knew a guy with that name who hacked a whole company.\n" +
            "I bet he could hack you in a blink of an eye.";

    public final static String GAME_USERNAME_BERNARDO = "Bernardo? I had a guy with that name on my class...\nHe was always coming up with mind-blowing theories!\n";

    public final static String GAME_USERNAME_PAULO = "Paulo? I once knew a guy with that name who used to work for Capcom. He is very talented.";

    public final static String GAME_USERNAME_EVANDRO = "Evandro? I once met a guy with that name in Salamanca... All the girls were crazy about him.";

    public final static String GAME_PATHETIC = " huh? What a pathetic name...";


    public static void GAME_START() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nThe game will start in...");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n3");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n2");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n1");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nESCAPE OR DIE!");
    }


    public final static String PLAYER_POSITION_WALL = "There's a wall in front of you! You can't advance!";

    public final static String ACTION_NOTHING_INTERESTING_FRONT = "Nothing interesting in front of you.";

    public final static String ACTION_NOTHING_GET = "There's nothing to get.";

    public final static String ACTION_REST = "It's nice to get a good rest.";

    public final static String ACTION_CANNOT = "You cannot do that!";

    public final static String ACTION_NO_ITEM = "You don't have this item.";

    public final static String ACTION_READ_NEWSPAPER = "THE END IS NEAR!\n" +
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
            "and it's important to play our best shot in the right hour, day and year.";

    public final static String ACTION_NOTHING_INTERESTING = "Nothing interesting.";

    public final static String ACTION_BAG_EMPTY = "Your bag is empty.";

    public final static String ACTION_BAG_ITEMS = "Items in your bag:";

    public final static String ACTION_NOT_UNDERSTAND = "I do not understand.\nBe more specific or look again.\nMaybe you'd like to press 'i' to check your options.";

    public final static String ACTION_OPEN_ENVELOPE = "There is a handwritten note and a key inside the envelope.\n" +
            "You put the items inside your bag.";

    public final static String ACTION_OPENED_ENVELOPE = "The envelope has already been opened.";

    public final static String ACTION_NO_ENVELOPE = "You don't have an envelope.";

    public final static String ACTION_READ_NOTE = "There's a quote from Cecília Meireles:\n'Freedom is the word that the human dream feeds on," +
            "\nthat no one can explain\nnor fail to understand.'";

    public final static String ACTION_NO_NOTE = "You don't have a handwritten note.";

    public final static String ACTION_CANT_USE_KEY = "You cannot use this key here.";

    public final static String ACTION_NO_KEY = "You don't have a key.";

    public final static String ACTION_USE_CANOPENER = "You need a can to use it with.";

    public final static String ACTION_FLIPFLOPS_MSG = "There's a hand written G under both of them.\nI wonder what that means...";

    public final static String ACTION_NO_NEED_FLIPFLOPS = "No need to use flip flops here.";

    public final static String ACTION_NO_NEWSPAPER = "You don't have a newspaper.";

    public final static String ACTION_GOLDKEY_MSG = "Not useful in this situation.";

    public final static String ACTION_CALENDAR_MSG = "It's a calendar from April 2020.\nThere's a red circle around day 17.\nI wonder what will happen on that day...";

    public final static String ACTION_CHECK_GOLDENKEY = "The key to success is to focus our conscious mind on things we desire not things we fear.\n";



}

