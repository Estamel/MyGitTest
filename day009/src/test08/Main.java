package test08;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> ll = new TreeSet<>();
        Student stu1 = new Student("zhangsan",23);
        Student stu2 = new Student("lisi",29);
        Student stu3 = new Student("wangwu",21);
        Student stu4 = new Student("zhaoliu",26);
        Student stu5 = new Student("zhengqi",21);
        ll.add(stu1);
        ll.add(stu2);
        ll.add(stu3);
        ll.add(stu4);
        ll.add(stu5);
        for (Student student : ll) {
            System.out.println(student);
        }
    }
}
