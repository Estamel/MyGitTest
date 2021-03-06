package test09;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10001);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);
        String s = new String(bytes, 0, bytes.length);
        System.out.println(s);
        ds.close();
    }
}
