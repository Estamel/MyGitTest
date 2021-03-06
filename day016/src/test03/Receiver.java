package test03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Receiver {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket(10001);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ms.joinGroup(InetAddress.getByName("224.0.1.0"));
        ms.receive(dp);
        String s = new String(bytes,0,bytes.length);
        System.out.println(s);
        ms.close();
    }
}