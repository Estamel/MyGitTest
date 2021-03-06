package test6;

import java.util.Arrays;
import java.util.Date;

public class newTest {
    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 2, 9, 6, 1, 5, 8};
        int begin = 0;
        int end = arr.length - 1;
        quick(arr, begin, end);
        Date a = new Date();
        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] arr, int begin, int end) {
        if (begin > end) {
            return;
        }
        int basenum = arr[begin];
        int begin0 = begin;
        int end0 = end;
        int temp;
        while (begin != end) {
            while (arr[end] > basenum) {
                end--;
            }
            while (arr[begin] < basenum) {
                begin++;
            }
            temp = arr[end];
            arr[end] = arr[begin];
            arr[begin] = temp;
        }
        quick(arr, begin0, begin - 1);
        quick(arr, begin + 1, end0);
    }
}
