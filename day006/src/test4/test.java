package test4;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int number = r.nextInt(10) + 1;
        int index = findNumber(number, arr);
        System.out.println(number);
        System.out.println(index);
    }

    private static int findNumber(int number, int[] arr) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
