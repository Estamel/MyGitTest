package test01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.31.66",10000);
        OutputStream os = s.getOutputStream();
        os.write("helloworld".getBytes());
        s.close();
    }
}
