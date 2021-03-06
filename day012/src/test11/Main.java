package test11;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day012\\a.txt"));
        String[] s = br.readLine().split(" ");
        int[] a = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        BufferedWriter bw = new BufferedWriter(new FileWriter("day012\\b.txt"));
        bw.write(Arrays.toString(a));
        br.close();
        bw.close();
    }
}
