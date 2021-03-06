package Test01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day014\\a.txt"));
        String a;
        while ((a=br.readLine())!=null){
            System.out.println(a);
        }
    }
}
