
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

    public Client() {
        try {
            client = new Socket("192.168.1.110", 8020);
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.submit(this);
            sendMessage();

        } catch (IOException ex) {
            ex.getMessage();
        }

    }

    public static void main(String[] args) {
        new Client();
    }

    private void sendMessage() {
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

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            while (client.isBound()) {
                String message = bufferedReader.readLine();
                if (message != null) {
                    System.out.println(Thread.currentThread().getName() +": " +message);
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
