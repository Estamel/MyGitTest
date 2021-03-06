package test13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\测试文件夹\\test.txt");
        FileOutputStream fos = new FileOutputStream("D:\\测试文件夹\\a\\te.txt");
        byte[] b = new byte[2];
        int a;
        while ((a=fis.read(b))!=-1){
            fos.write(b,0,a);
        }
        fis.close();
        fos.close();
    }
}
