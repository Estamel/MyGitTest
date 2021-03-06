package test03;

import java.lang.reflect.Method;

public class Main2 {
    public static void main(String[] args) throws Exception{
        Class student = Class.forName("test03.Student");
        Student o = (Student) student.newInstance();
        Method function4 = student.getMethod("function4", String.class);
        Object invoke = function4.invoke(o, "666");
        System.out.println(invoke);
    }
}
