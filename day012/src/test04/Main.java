package test04;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\测试文件夹\\test.txt"));
        osw.write("我带你们打");
        osw.close();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\测试文件夹\\test.txt"));
        int a;
        while ((a=isr.read())!=-1){
            System.out.println(a);
        }
        isr.close();
        System.out.println();
        FileInputStream fis = new FileInputStream("D:\\测试文件夹\\test.txt");
        int c;
        byte[] b=new byte[1024];
        while ((c=fis.read(b))!=-1){
            System.out.println(new String(b, 0, c));
        }
        fis.close();
    }
}
