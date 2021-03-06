package test09;

import test08.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> ll = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge()-o2.getAge();
                if (result==0) {
                    result = o1.getName().compareTo(o2.getName());
                }
                return result;
            }
        });
        test08.Student stu1 = new test08.Student("zhangsan",21);
        test08.Student stu2 = new test08.Student("lisi",21);
        test08.Student stu3 = new test08.Student("wangwu",21);
        test08.Student stu4 = new test08.Student("zhaoliu",21);
        test08.Student stu5 = new test08.Student("zhengqi",21);
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
