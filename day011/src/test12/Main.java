package test12;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\测试文件夹\\test.txt");
        int a;
        while ((a=fis.read())!=-1){
            char b = (char)a;
            System.out.print(b);
        }
        fis.close();
    }
}
