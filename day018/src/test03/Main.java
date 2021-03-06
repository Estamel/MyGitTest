package test03;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        Class Student = Class.forName("test03.Student");
        Student o = (Student) Student.newInstance();
        Method function4 = Student.getMethod("function4", String.class);
        Object o1 = function4.invoke(o, "张三");
        System.out.println(o1);
    }
}
