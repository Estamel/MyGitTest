package test05;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class student = Class.forName("test05.Student");
        Constructor[] constructors = student.getConstructors();
        Constructor constructor = student.getConstructor(String.class,int.class);
        System.out.println(constructor);
    }
}
