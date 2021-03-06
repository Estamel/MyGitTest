package test04;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("G:\\QQ文件库");
        long[] arr = new long[3];
        countFile(file, arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void countFile(File file, long[] arr) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                countFile(file1, arr);
            } else if (file1.getName().endsWith(".txt")) {
                arr[0]++;
            } else if (file1.getName().endsWith(".png")) {
                arr[1]++;
            } else {
                arr[2]++;
            }
        }
    }
}