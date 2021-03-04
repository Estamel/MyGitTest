package test02;

import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        byte[] bytes = "HelloWorld".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,InetAddress.getByName("192.168.31.58"),10000);
        ds.send(dp);
        ds.close();
    }
}
