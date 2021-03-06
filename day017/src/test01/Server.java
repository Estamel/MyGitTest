package test01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket accept = ss.accept();
        InputStream si =accept.getInputStream();
        int a ;
        while ((a=si.read())!=-1){
            System.out.print((char)a);
        }
        ss.close();
    }
}
