package test05;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 2, 9, 6, 4, 8};
        int begin = 0;
        int end = arr.length - 1;
        quick(arr, begin, end);
        System.out.println(Arrays.toString(arr));
    }

    private static void quick(int[] arr, int begin, int end) {
        if (begin>end) {
            return;
        }
        int base = arr[begin];
        int begin0 = begin;
        int end0 = end;
        int temp;
        while (begin != end) {
            while (arr[end] > base && end > begin) {
                end--;
            }
            while (arr[begin] < base && end > begin) {
                begin++;
            }
            temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
        }
        quick(arr, begin0, begin - 1);
        quick(arr, begin + 1, end0);
    }
}
