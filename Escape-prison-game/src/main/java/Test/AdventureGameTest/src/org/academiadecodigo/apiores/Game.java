package Test.AdventureGameTest.src.org.academiadecodigo.apiores;
import Test.AdventureGameTest.src.org.academiadecodigo.apiores.Commands.Directions;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Game {

    private PlayerPosition playerPosition = new PlayerPosition(2, 2);
    private CellVerification cellVerification = new CellVerification();
    private HashSet<String> bag = new HashSet<String>();
    private boolean pushWadrobe = false;
    private boolean openDoor = false;
    private boolean openEnvelope = false;
    private boolean openWardrobe = false;
    private boolean openVault = false;
    private Client client;
    private boolean gameStart = false;
    private boolean gameEnd = false;
    private boolean player1Connected = false;

    public void init() {

        System.out.println(Messages.GAME_TITLE);

        System.out.println(Messages.GAME_WELCOME);

        System.out.println(Messages.GAME_COMMANDS);

        Prompt prompt = new Prompt(System.in, System.out);
        StringInputScanner usernameInput = new StringInputScanner();
        usernameInput.setMessage(Messages.GAME_USERNAME);
        String username = prompt.getUserInput(usernameInput);
        client = new Client(username, this);
        if (username.toLowerCase().equals("jojo")){
            System.out.println(Messages.GAME_USERNAME_JOJO);
        } else if (username.toLowerCase().equals("rita")){
            System.out.println(Messages.GAME_USERNAME_RITA);
        } else if (username.toLowerCase().equals("ricardo")){
            System.out.println(Messages.GAME_USERNAME_RICARDO);
        } else if (username.toLowerCase().equals("soraia")){
            System.out.println(Messages.GAME_USERNAME_SORAIA);
        } else if (username.toLowerCase().equals("bernardo")){
            System.out.println(Messages.GAME_USERNAME_BERNARDO);
        } else if (username.toLowerCase().equals("francisco")){
            System.out.println(Messages.GAME_USERNAME_FRANCISCO);
        } else if (username.toLowerCase().equals("xavier")){
            System.out.println(Messages.GAME_USERNAME_XAVIER);
        } else if (username.toLowerCase().equals("evandro")){
            System.out.println(Messages.GAME_USERNAME_EVANDRO);
        } else if (username.toLowerCase().equals("paulo")){
            System.out.println(Messages.GAME_USERNAME_PAULO);
        } else {
            System.out.println("\n" + username + Messages.GAME_PATHETIC);
        }

        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(player1Connected){
                System.out.println("\nYou are now connected to the server. Waiting for player 2.");
                player1Connected = false;
            }
            if(gameStart) {
                if (gameEnd){
                    client.sendEndingMessage();
                }
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

    public void gameStart(){
        Messages.GAME_START();
        gameStart = true;
    }

    public void gameEnd(){
        gameEnd = true;
    }

    public void player1Connected() {
        player1Connected = true;
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void gameClose(){
        System.exit(0);
    }
}
