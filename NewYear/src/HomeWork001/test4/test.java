package HomeWork001.test4;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<=10) {
            move(n, 'A', 'B', 'C');
        }
    }

    public static void move(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + A + " to " + C);
        } else {
            move(n - 1, A, C, B);
            System.out.println("Move disk " + n + " from " + A + " to " + C);
            move(n - 1, B, A, C);
        }
    }
}
