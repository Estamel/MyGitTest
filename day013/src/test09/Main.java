package test09;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                AccountIn();
            case 2:
                AccountShow();
        }
    }

    private static void AccountShow() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day013\\a.txt"));
        Object o = ois.readObject();
        ArrayList<Account> arr = (ArrayList<Account>) o;
        ois.close();
        for (Account account : arr) {
            System.out.println(account);
        }
    }

    public static void AccountIn() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day013\\a.txt", true))) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                Account a = new Account();
                System.out.println("请输入带存储账号的网站名");
                a.setWebName(sc.next());
                System.out.println("请输入带存储账号");
                a.setAccount(sc.next());
                System.out.println("请输入带存储密码");
                a.setPassWord(sc.next());
                oos.writeObject(a);
                oos.flush();
                System.out.println("1/继续输入0/停止输入");
                int b = sc.nextInt();
                if (b == 0) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
