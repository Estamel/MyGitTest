package test04;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> tree = new TreeSet<>();
        Student stu1 = new Student("zhangsan",13);
        Student stu2 = new Student("lisi",14);
        Student stu3 = new Student("wangwu",15);
        Student stu4 = new Student("zhaoliu",15);
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        for (Student student : tree) {
            System.out.println(student);
        }
    }
}
