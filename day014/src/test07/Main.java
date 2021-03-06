package test07;

import java.io.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties p1 = new Properties();
        FileReader isr = new FileReader("day014\\prop.properties");
        p1.load(isr);
        isr.close();
        String name = p1.getProperty("name");
        System.out.println(name);
        String age = p1.getProperty("age");
        int i = Integer.parseInt(age);
        System.out.println(i);
        Student stu = new Student(name,i);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day014\\a.txt"));
        oos.writeObject(stu);
        oos.close();
    }
}
