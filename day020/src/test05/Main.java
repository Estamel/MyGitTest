package test05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        Class stuClass = Student.class;
        Class student = Class.forName("test05.Student");
        Constructor constructors = stuClass.getDeclaredConstructor(String.class,int.class);
        constructors.setAccessible(true);
        Student o = (Student) constructors.newInstance("田所浩二", 24);
        System.out.println(o);
        Method show = stuClass.getDeclaredMethod("show",String.class);
        show.setAccessible(true);
        show.invoke(o,"55");
    }
}
