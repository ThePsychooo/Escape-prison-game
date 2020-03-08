import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.*;

public class Server {


    private static ArrayList<Socket> store;
    private boolean player1Joined = false;


    public static void main(String[] args) {
        store = new ArrayList<>();
        Server server = new Server();
        server.listen(8020);
    }

    public void listen(int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            serverInit(serverSocket);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public synchronized void serverInit(ServerSocket server) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        try {
            while (true) {

                Socket client = server.accept();
                executorService.submit(new socketThread(client));

            }
        } catch (Exception e) {
        }
    }

    public void solvingConnection(Socket client) {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
                if (store.size() == 2) {
                    for (int i = 0; i < store.size(); i++) {
                        PrintWriter output = new PrintWriter(store.get(i).getOutputStream(), true);
                        output.println("2nd_Player_Connected");
                        output.flush();
                    }
                }

            if (store.size() > 2) {
                PrintWriter output = new PrintWriter(store.get(2).getOutputStream(), true);
                output.println("The Server is full.");
                output.flush();
                store.remove(client);
                client.close();

            }
                if (!player1Joined) {
                    PrintWriter output = new PrintWriter(store.get(0).getOutputStream(), true);
                    output.println("Waiting for a second player.");
                    player1Joined = true;
                    output.flush();
                }

                do {
                    String c = input.readLine();
                    if (c.equals("/quit")) {
                        System.out.println("disconnecting");
                        store.remove(client);
                        client.close();
                        return;
                    }
                    System.out.println(c);
                } while (true);

            } catch(Exception e){
                e.getMessage();
            }
    }

    class socketThread implements Runnable {
        private Socket clientSocket;

        public socketThread(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            if (clientSocket.isBound())
                store.add(clientSocket);
            solvingConnection(clientSocket);
        }
    }

}
