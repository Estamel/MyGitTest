package HomeWork001.test3;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        StringBuilder sb1 = new StringBuilder(a);
        StringBuilder sb2 = new StringBuilder(b);
        BigDecimal bd1 = new BigDecimal(String.valueOf(sb1.reverse()));
        BigDecimal bd2 = new BigDecimal(String.valueOf(sb2.reverse()));
        BigDecimal add = bd1.add(bd2);
        StringBuilder sb3 = new StringBuilder(add.toString());
        BigDecimal bd3 = new BigDecimal(String.valueOf(sb3.reverse()));
        System.out.print(bd3);
    }
}
