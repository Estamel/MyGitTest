package test08;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.31.67");
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
    }
}
