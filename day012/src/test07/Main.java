package test07;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day012\\a.txt"));
        bos.write("Hello\r\n".getBytes());
        bos.write("我\r\n".getBytes());
        bos.close();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day012\\a.txt"));
        int a;
        //byte[] bytes = new byte[1024];
        while ((a=bis.read())!=-1){
            System.out.print((char)a);
        }
    }
}
