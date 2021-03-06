package test010;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Properties p = new Properties();
        FileReader reader = new FileReader("day016\\location.properties");
        p.load(reader);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(p.getProperty("location")))) {
            Object o = ois.readObject();
            ArrayList<Student> o1 = (ArrayList<Student>) o;
            for (Student student : o1) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("请输入三位学生信息");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(p.getProperty("location")));
            ArrayList<Student> arr = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                String s = sc.next();
                int a = sc.nextInt();
                Student stu = new Student(s, a);
                arr.add(stu);
            }
            oos.writeObject(arr);
            oos.close();
        }
    }
}