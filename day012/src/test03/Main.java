package test03;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\测试文件夹\\test.txt"));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int[] a = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            int i1 = Integer.parseInt(s1[i]);
            a[i] = i1;
        }
        Arrays.sort(a);
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\测试文件夹\\test3.txt"));
        for (int i = 0; i < a.length; i++) {
            bw.write(a[i]+" ");
        }
        br.close();
        bw.close();
    }
}
