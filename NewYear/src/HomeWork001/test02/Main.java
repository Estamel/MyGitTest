package HomeWork001.test02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char[] arr = st.toCharArray();
        int count = 0;
        char o = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (o == arr[i]) {
                count++;
                if (i == arr.length - 1) {
                    System.out.print("(" + count + "," + o + ")");
                }
            } else {
                System.out.print("(" + count + "," + o + ")"+",");
                count = 1;
                o = arr[i];
                if (i == arr.length - 1) {
                    System.out.print("(" + count + "," + o + ")");
                }
            }
        }
    }
}
