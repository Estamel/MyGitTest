package test08;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("day013\\a.txt"))){
            writer.write("账号：114514");
            writer.newLine();
            writer.write("密码：1919810");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("day013\\a.txt"))) {
            int a;
            while ((a=reader.read())!=-1){
                System.out.print((char)a);
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
