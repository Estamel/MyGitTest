package test09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);
        while (true) {
            Socket accept = ss.accept();
            BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\测试文件夹\\云端\\" + UUID.randomUUID()+".txt"));
            byte[] b = new byte[1024];
            while ((bis.read(b)) != -1) {
                bos.write(b);
                bos.flush();
                bos.close();
            }
        }
    }
}