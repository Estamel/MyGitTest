package test07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fileInputStream = new FileInputStream("day017\\count");
        p.load(fileInputStream);
        String count = p.getProperty("count");
        int w = Integer.parseInt(count);
        System.out.println(w);
        if (w > 3) {
            System.out.println("游戏试玩已结束，想玩请充值(www.itcast.cn)");
            System.exit(0);
        }
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int q = r.nextInt(100) + 1;
        System.out.println(q);
        while (true) {
            int a = sc.nextInt();
            if (a < q) {
                System.out.println("小了");
            } else if (a > q) {
                System.out.println("大了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
        w++;
        String s = Integer.toString(w);
        FileOutputStream fileOutputStream = new FileOutputStream("day017\\count");
        p.setProperty("count", s);
        p.store(fileOutputStream, null);
        fileInputStream.close();
        fileOutputStream.close();
    }
}
