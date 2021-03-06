package test01;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Class student = Class.forName("test01.Student");
        Constructor declaredConstructor = student.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        Student o = (Student) declaredConstructor.newInstance("张三", 23);
        System.out.println(o);
    }
}
