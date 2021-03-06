package test02;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("请输入用户名");
        String name = sc.next();
        System.out.println("请输入密码");
        String passWord = sc.next();
        FileWriter fw = new FileWriter("day012\\a.txt");
        fw.write(name);
        fw.write("\r\n");
        fw.write(passWord);
        fw.close();*/
        FileInputStream fis = new FileInputStream("day012\\a.txt");
        int a;
        byte[] b = new byte[3];
        while ((a=fis.read(b))!=-1){

        }
    }
}
