package test04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream("day013\\a.txt"));
        int a;
        while ((a=is.read())!=-1){
            System.out.print(a+" ");
        }
        System.out.println();
        byte[] bytes = is.readAllBytes();
        System.out.print(Arrays.toString(bytes));
        int b = 230;
        System.out.println((char) b);
    }
}
