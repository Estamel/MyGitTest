package test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        DatagramSocket ds = new DatagramSocket(10000);
        while (true) {
            DatagramPacket dp = new DatagramPacket(b,b.length);
            ds.receive(dp);
            String s = new String(b, 0, b.length);
            if ("886".equals(s)){
                break;
            }
            System.out.println(s);
        }
        ds.close();
    }
}
