import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.*;

public class Server {

    private Socket client;
    private static Vector<Socket> store;
    private boolean player1Joined = false;


    public static void main(String[] args) {
        store = new Vector<>();
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

    public void serverInit(ServerSocket server) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try {
            while (true) {
                client = server.accept();
                executorService.submit(new socketThread());

                if (!player1Joined) {
                    PrintWriter output = new PrintWriter(store.elementAt(0).getOutputStream(), true);
                    output.println("Waiting for a second player.");
                    player1Joined = true;
                    output.flush();
                    System.out.println();
                    player1Joined = true;
                }
            }

              /*  if (store.size() == 1){
                    for (int i = 0; i < store.size(); i++) {
                        try {
                            PrintWriter output = new PrintWriter(store.elementAt(i).getOutputStream(), true);
                            output.println("Waiting for a second player.");
                            output.flush();
                        } catch (Exception e) {
                            System.out.println();
                        }
                    }
                }*/

        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void solvingConnection(Socket client) {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
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
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    class socketThread implements Runnable {
        @Override
        public void run() {
            if (client.isBound())
                store.add(client);
            solvingConnection(client);
        }
    }

}
