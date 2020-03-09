package Test.AdventureGameTest.src.org.academiadecodigo.apiores;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client implements Runnable {
    private static Scanner scanner = new Scanner(System.in);

    private Socket client;
    private BufferedReader reader;
    private BufferedWriter writer;
    private String username;
    private Game game;
    private String arr[];
    String firstWord;
    String theRest;

    public Client(String username, Game game) {
        this.username = username;
        this.game = game;
        try {
            client = new Socket("192.168.1.114", 8090);
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.submit(this);
            sendStartingMessage();

        } catch (IOException ex) {
            ex.getMessage();
        }

    }

    private void sendStartingMessage() {

        try {
            writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            reader = new BufferedReader(new InputStreamReader(System.in));
            writer.write("INTRO " + username + " has joined the server.");
            writer.newLine();
            writer.flush();
        } catch (UnknownHostException ex) {
            ex.getMessage();
        } catch (IOException er) {
            er.getMessage();
        }
    }

    public void sendEndingMessage() {
        try {
            writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            reader = new BufferedReader(new InputStreamReader(System.in));
            writer.write("END " + username + " has escaped his cell. " + username + " WINS!");
            writer.newLine();
            writer.flush();
        } catch (UnknownHostException ex) {
            ex.getMessage();
        } catch (IOException er) {
            er.getMessage();
        }
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            while (client.isBound()) {
                String message = bufferedReader.readLine();
                if (message != null) {
                    if (message.equals("2nd_Player_Connected")) {
                        game.gameStart();
                    } else if (message.equals("Waiting for a second player.")) {
                        game.player1Connected();
                    } else if (message.equals("The Server is full.")) {
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("\nThe Server is full. You must wait for the current game to finish.");
                        System.exit(0);
                    } else {
                        arr = message.split(" ", 2);
                        if (arr[0].equals("END")){
                            String theRest = arr[1];
                            System.out.println(theRest);
                            game.gameClose();
                        }
                    }
                } else {
                    client.close();
                }
            }
        } catch (IOException ex) {
            ex.getMessage();
        }

    }

    public String input() {
        return scanner.next();
    }
}
