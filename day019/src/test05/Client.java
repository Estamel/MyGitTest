package test05;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.31.58", 10000);
        OutputStream outputStream = s.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\测试文件夹\\本地\\12qq.mp4"));
        byte[] b = new byte[1024];
        while ((bis.read(b)) != -1) {
            bos.write(b, 0, b.length);
            bos.flush();
        }
        s.close();
        bis.close();
    }
}
