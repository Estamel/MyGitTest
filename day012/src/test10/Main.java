package test10;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号");
        String userName = sc.next();
        System.out.println("请输入密码");
        String userCode = sc.next();
        BufferedWriter bw = new BufferedWriter(new FileWriter("day012\\c.txt"));
        bw.write(userName);
        bw.newLine();
        bw.write(userCode);
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("day012\\c.txt"));
        String a;
        while ((a=br.readLine())!=null){
            System.out.println(a);
        }
        br.close();
    }
}
