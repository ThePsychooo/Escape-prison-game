package Test.AdventureGameTest.src.org.academiadecodigo.apiores;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client implements Runnable {
    private static Scanner scanner = new Scanner(System.in);

    private Socket client;
    private BufferedReader reader;
    private BufferedWriter writer;
    private String username;
    private Game game;

    public Client(String username, Game game) {
        this.username = username;
        this.game = game;
        try {
            client = new Socket("192.168.1.105", 8020);
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.submit(this);
            sendStartingMessage();

        } catch (IOException ex) {
            ex.getMessage();
        }

    }

    /*private void sendMessage() {
        try {
            writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            reader = new BufferedReader(new InputStreamReader(System.in));
            while (client.isBound()) {
                String chat = reader.readLine();
                if (chat != null) {
                    writer.write(chat);
                    writer.newLine();
                    writer.flush();
                } else {
                    client.close();
                }
            }
        } catch (UnknownHostException ex) {
            ex.getMessage();
        } catch (IOException er) {
            er.getMessage();
        }
    }
   */

    private void sendStartingMessage(){

        try {
            writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            reader = new BufferedReader(new InputStreamReader(System.in));
                    writer.write(username + " has joined the server.");
                    writer.newLine();
                    writer.flush();
        } catch (UnknownHostException ex) {
            ex.getMessage();
        } catch (IOException er) {
            er.getMessage();
        }
    }

    public void sendEndingMessage(){
        try {
            writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            reader = new BufferedReader(new InputStreamReader(System.in));
            writer.write(username + " has escaped his cell. " + username + " WINS!");
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
                    if(message.equals("2nd_Player_Connected")){
                        game.gameStart();
                    }else if(message.equals("Waiting for a second player.")){
                       game.player1Connected();
                    }
                } else {
                    client.close();
                }
            }
        } catch (IOException ex) {
            ex.getMessage();
        }

    }
    public String input(){
        return scanner.next();
    }
}
