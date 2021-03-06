package quickScale;

import java.util.Arrays;

public class justTest {
    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 2, 9, 6, 1, 5, 8};
        int begin = 0;
        int end = arr.length - 1;
        quickScal(arr, begin, end);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickScal(int[] arr, int begin, int end) {
        if (begin > end) {
            return;
        }
        int basenum = arr[begin];
        int begin0 = begin;
        int end0 = end;
        int temp;
        while (end != begin) {
            while (arr[end] > basenum && end > begin) {
                end--;
            }
            while (basenum > arr[begin] && end > begin) {
                begin++;
            }
            temp = arr[end];
            arr[end] = arr[begin];
            arr[begin] = temp;
        }
        quickScal(arr, begin0, begin - 1);
        quickScal(arr, end + 1, end0);
    }
}
/* if (begin > end) {
            return;
        }
        int begin0 = arr[begin];
        int left0 = begin;
        int right0 = end;
        int temp;
        while (end != begin) {
            while (arr[end] > begin0) {
                end--;
            }
            while (arr[begin] < begin0) {
                begin++;
            }
            temp = arr[end];
            arr[end] = arr[begin];
            arr[begin] = temp;
        }
        temp = arr[begin];
        arr[begin] = arr[left0];
        arr[left0] = temp;
        quickScal(arr, left0, begin - 1);
        quickScal(arr, begin + 1, right0);
    }*/
