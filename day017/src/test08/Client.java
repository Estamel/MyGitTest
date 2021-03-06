package test08;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("192.168.31.66",10000);
        OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
        while (true) {
            String a = sc.next();
            osw.write(a+"\r\n");
            osw.flush();
        }
    }
}
