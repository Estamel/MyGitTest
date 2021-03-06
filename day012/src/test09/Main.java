package test09;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day012\\b.txt"));
        bw.write("我a带b你c们d打");
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("day012\\b.txt"));
        int a;
        char[] c = new char[1024];
        while ((a=br.read(c))!=-1){
            System.out.println(new String(c,0,a));
        }
    }
}
