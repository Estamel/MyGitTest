package test02;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        while (true) {
            String s = sc.nextLine();
            if ("886".equals(s)) {
                break;
            }
            byte[] bytes = (InetAddress.getByName("127.0.0.1").getHostName()+":"+s).getBytes();
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.31.65"),10000);
            ds.send(dp);
        }
        ds.close();
    }
}
