package test11;

import test09.Account;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //AccountIn();
        //AccountSearch();
        AnotherAccountSearch();
    }

    private static void AnotherAccountSearch() throws ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day013\\a.txt"))) {
            Object obj = ois.readObject();

            ArrayList<Account> arrayList = (ArrayList<Account>) obj;
            ois.close();
            for (Account s : arrayList) {
                System.out.println(s);
            }
        }catch (EOFException e) {
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void AccountSearch() throws ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day013\\a.txt"));) {
            Object a;
            while ((a = ois.readObject()) != null) {
                Account b = (Account) a;
                System.out.println(b);
            }
        } catch (EOFException e) {
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void AccountIn() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day013\\a.txt", true))) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                test09.Account a = new Account();
                System.out.println("请输入待存储账号的网站名");
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
