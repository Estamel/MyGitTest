package test03;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        while (true) {
            try {
                Student stu = new Student();
                Scanner sc = new Scanner(System.in);
                String name = sc.nextLine();
                if (name.equals("0")) {
                    break;
                }
                String age = sc.nextLine();
                int a = Integer.parseInt(age);
                stu.setName(name);
                stu.setAge(a);
                arr.add(stu);
            } catch (NumberFormatException e) {
                System.out.println("只支持数字年龄输入");
            } catch (AgeException e) {
                System.out.println("年龄超区间");
            }
        }
        for (Student student : arr) {
            System.out.println(student);
        }
    }
}
