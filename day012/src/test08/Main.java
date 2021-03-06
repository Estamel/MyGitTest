package test08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day012\\a.txt");
        String s = "我带你们打";
        char[] chars = s.toCharArray();
        fw.write(s);
        fw.write("\r\n");
        fw.write(chars);
        fw.flush();
        FileReader fr = new FileReader("day012\\a.txt");
        int a;
        char[] chars1 = new char[1024];
        while ((a=fr.read(chars))!=-1){
            System.out.println(new String(chars1,0,a));
        }
        fr.close();
    }
}
