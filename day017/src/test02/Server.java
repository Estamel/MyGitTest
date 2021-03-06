package test02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket accept = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        br.readLine();
        System.out.println("test");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("歪比巴卜");
        bw.newLine();
        bw.flush();
        ss.close();
    }
}
