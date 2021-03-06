package test08;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket accept = ss.accept();
        InputStreamReader isr = new InputStreamReader(accept.getInputStream());
        while (true) {
            int a;
            while ((a=isr.read())!=1){
                System.out.print((char) a);
            }
        }
    }
}
