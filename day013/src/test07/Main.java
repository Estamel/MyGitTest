package test07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Writer writer = new BufferedWriter(new FileWriter("day013\\a.txt"));
        int a = (int)'我';
        System.out.println(a);
        writer.write(25105);
        writer.close();
    }
}
