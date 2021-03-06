package test10;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student stu1 = new Student("xiaohei",23);
        Student stu2 = new Student("xiaohei",23);
        Student stu3 = new Student("xiaomei",22);
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        for (Student h : hs) {
            System.out.println(h);
        }
    }
}
