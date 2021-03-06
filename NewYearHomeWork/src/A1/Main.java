package A1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = arr[0];
        int flag = m;
        if (m >= 0) System.arraycopy(arr, 0, arr2, 0, m);
        tt:while (true) {
            for (int i = 0; i < m; i++) {
                arr2[i]--;
                if (arr2[i] == 0) {
                    arr2[i] = arr[flag];
                    count += arr[flag];
                    if (flag < n-1) {
                        flag++;
                    } else {
                        break tt;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
