package test02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class Student = Class.forName("test02.Student");
        Constructor constructor = Student.getConstructor(String.class,int.class,int.class);
        Student o = (Student) constructor.newInstance("张三", 23, 666);
        Field money = Student.getDeclaredField("money");
        money.setAccessible(true);
        Object o1 = money.get(o);
        System.out.println(o1);
    }
}
