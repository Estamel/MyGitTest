package test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10000);
        byte[] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b,b.length);
        ds.receive(dp);
        System.out.println(new String(dp.getData(),0,dp.getLength()));
        ds.close();
    }
}
