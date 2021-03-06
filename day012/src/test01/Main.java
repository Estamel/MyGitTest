package test01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\测试文件夹\\test.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\测试文件夹\\test2.txt"));
        int a;
        byte[] bytes=new byte[8196];
        while ((a=bis.read(bytes))!=-1) {
            bos.write(bytes,0,a);
        }
        bis.close();
        bos.close();
    }
}
