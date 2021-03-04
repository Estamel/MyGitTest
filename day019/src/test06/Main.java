package test06;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class student = Class.forName("test06.Student");
        Constructor constructor = student.getDeclaredConstructor(String.class,String.class);
        constructor.setAccessible(true);
        Student instance = (Student) constructor.newInstance("田所浩二", "24");
        System.out.println(instance);
        Method show = student.getDeclaredMethod("show");
        show.setAccessible(true);
        show.invoke(instance);
    }
}
