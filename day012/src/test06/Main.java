package test06;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\测试文件夹\\test.txt"));
        int a;
        byte[] bytes = new byte[4];
        while ((a=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,a));
        }
    }
}
