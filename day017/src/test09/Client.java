package test09;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.31.66",10001);
        BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\测试文件夹\\本地\\test.txt"));
        byte[] a= new byte[1024];
        while ((bis.read(a))!=-1){
            bos.write(a,0,a.length);
            bos.flush();
        }
        s.close();
        bis.close();
    }
}
