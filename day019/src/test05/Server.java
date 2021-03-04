package test05;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        while (true) {
            Socket accept = ss.accept();
            ServerThread st = new ServerThread(accept);
            Thread t = new Thread(st);
            t.start();
        }
    }
}
