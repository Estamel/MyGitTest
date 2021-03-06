package test09;

import java.io.IOException;
import java.net.*;

public class Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String s = "这是一个测试数据";
        byte[] bytes = s.getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.31.67"),10001);
        ds.send(dp);
        ds.close();
    }

}
