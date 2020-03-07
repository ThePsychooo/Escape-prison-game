package Test.AdventureGameTest.src.org.academiadecodigo.apiores;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Commands.Directions;
import org.academiadecodigo.apiores.Main;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.InputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.util.HashSet;
import java.util.Set;

public class Game {

    private PlayerPosition playerPosition = new PlayerPosition(2, 2);
    private CellVerification cellVerification = new CellVerification();
    private HashSet<String> bag = new HashSet<String>();
    private boolean pushWadrobe = false;
    private boolean openDoor = false;
    private boolean openEnvelope = false;
    private boolean openWardrobe = false;
    private boolean openVault = false;

    public void init() {

        System.out.println("\n" +
                "▓█████   ██████  ▄████▄   ▄▄▄       ██▓███  ▓█████     ██▀███   ▒█████   ▒█████   ███▄ ▄███▓\n" +
                "▓█   ▀ ▒██    ▒ ▒██▀ ▀█  ▒████▄    ▓██░  ██▒▓█   ▀    ▓██ ▒ ██▒▒██▒  ██▒▒██▒  ██▒▓██▒▀█▀ ██▒\n" +
                "▒███   ░ ▓██▄   ▒▓█    ▄ ▒██  ▀█▄  ▓██░ ██▓▒▒███      ▓██ ░▄█ ▒▒██░  ██▒▒██░  ██▒▓██    ▓██░\n" +
                "▒▓█  ▄   ▒   ██▒▒▓▓▄ ▄██▒░██▄▄▄▄██ ▒██▄█▓▒ ▒▒▓█  ▄    ▒██▀▀█▄  ▒██   ██░▒██   ██░▒██    ▒██ \n" +
                "░▒████▒▒██████▒▒▒ ▓███▀ ░ ▓█   ▓██▒▒██▒ ░  ░░▒████▒   ░██▓ ▒██▒░ ████▓▒░░ ████▓▒░▒██▒   ░██▒\n" +
                "░░ ▒░ ░▒ ▒▓▒ ▒ ░░ ░▒ ▒  ░ ▒▒   ▓▒█░▒▓▒░ ░  ░░░ ▒░ ░   ░ ▒▓ ░▒▓░░ ▒░▒░▒░ ░ ▒░▒░▒░ ░ ▒░   ░  ░\n" +
                " ░ ░  ░░ ░▒  ░ ░  ░  ▒     ▒   ▒▒ ░░▒ ░      ░ ░  ░     ░▒ ░ ▒░  ░ ▒ ▒░   ░ ▒ ▒░ ░  ░      ░\n" +
                "   ░   ░  ░  ░  ░          ░   ▒   ░░          ░        ░░   ░ ░ ░ ░ ▒  ░ ░ ░ ▒  ░      ░   \n" +
                "   ░  ░      ░  ░ ░            ░  ░            ░  ░      ░         ░ ░      ░ ░         ░   \n" +
                "                ░                                                                           \n");

        System.out.println("\nCOMMANDS:\n\nW - Go West\nN -" +
                " Go North\nS - Go South\nE - Go East\n\nLook\nCheck Bag\nGet <Item>\nUse <Item>\nOpen <Item>\n" +
                "Read <Item>\nSearch<Item>\n\nIf you want to check this instructions again, use command i.\n");

        Prompt prompt = new Prompt(System.in, System.out);
        StringInputScanner usernameInput = new StringInputScanner();
        usernameInput.setMessage("What's your name prisoner?\n");
        String username = prompt.getUserInput(usernameInput);
        if (username.toLowerCase().equals("jojo")){
            System.out.println("Jojo? I once had and MC with that name. What an idiot he was...");
        } else {
            System.out.println(username + " huh? What a pathetic name...");
        }

        while (true) {
            StringInputScanner commandInput = new StringInputScanner();
            commandInput.setMessage("\nCommand:\n");
            String command = prompt.getUserInput(commandInput).toLowerCase();

            if (Directions.GO_NORTH.getInput().equals(command) || Directions.GO_SOUTH.getInput().equals(command) ||

                    Directions.GO_EAST.getInput().equals(command) ||
                    Directions.GO_WEST.getInput().equals(command)) {
                playerPosition.updatePosition(command);
            } else {
                cellVerification.verify(command, playerPosition, this);
            }
        }
    }


    public void updateBag(String item){
        bag.add(item);
    }

    public  Set<String> getBag(){
        return bag;
    }

    public void pushWardrobe(){
        pushWadrobe = true;
    }

    public boolean getPushWadrobe(){
        return pushWadrobe;
    }

    public void openDoor(){
        openDoor = true;
    }

    public boolean getOpenDoor(){
        return openDoor;
    }

    public boolean getOpenEnvelope(){
        return openEnvelope;
    }

    public void openEnvelope(){
        openEnvelope = true;
    }

    public boolean getOpenWardrobe(){
        return openWardrobe;
    }

    public void openWardrobe(){
        openWardrobe = true;
    }

    public boolean getOpenVault(){
        return openVault;
    }

    public void openVault(){
        openVault = true;
    }
}
