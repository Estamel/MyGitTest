package test06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new FileReader("day017\\NameList.txt"));
        ArrayList<String> arr = new ArrayList<>();
        String s;
        while ((s=bis.readLine())!=null){
            arr.add(s);
        }
        Random r = new Random();
        int i = r.nextInt(arr.size());
        System.out.println(arr.get(i));
    }
}
