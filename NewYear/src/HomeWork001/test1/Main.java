package HomeWork001.test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = a;
        long sum = 0;
        for (long d = b; d > 0; d--) {
            for (long i = d; i > 0; i--) {
                for (long l = 0; l < i - 1; l++) {
                    c = c * 10;
                    if (l == i - 2) {
                        sum += c;
                        c = a;
                    }
                }
                if (i == 1) {
                    sum += a;
                }
            }
        }
        System.out.println(sum);
    }
}
