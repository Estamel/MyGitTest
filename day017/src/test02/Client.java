package test02;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.31.66",10000);
        OutputStream outputStream = s.getOutputStream();
        outputStream.write("歪比歪比".getBytes());
        s.shutdownOutput();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        br.readLine();
        s.close();
    }
}
