package lesson5;


import java.io.*;
import java.net.Socket;
import java.util.logging.Logger;

public class Client {

    protected static Logger log = Logger.getLogger("Client.class");

    public static final int PORT = 19000;
    public static final String HOST = "localhost";

    private static final String EXIT = "exit";

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket(HOST, PORT);

        // потоки данных net
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        socket.getInputStream()));

        PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true);

        // консоль
        BufferedReader console = new BufferedReader(
                new InputStreamReader(System.in));

        String line;
        String result;

        System.out.println("Please type...");

        while ((line = console.readLine()) != null) {
            if (EXIT.equalsIgnoreCase(line)) {
                log.info("Closing chat");
                break;
            }


            out.println(line);
            out.flush();

            result = in.readLine();
            System.out.println(">> " + result);

        }

    }
}
