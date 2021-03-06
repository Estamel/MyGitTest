package test02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main2 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchMethodException {
        Class name = Class.forName("test02.Student");
        Constructor constructor = name.getConstructor(String.class, int.class, int.class);
        Object o = constructor.newInstance("张三", 23, 666);
        Field money = name.getDeclaredField("money");
        money.setAccessible(true);
        Object o1 = money.get(o);
        System.out.println(o1);
    }
}
