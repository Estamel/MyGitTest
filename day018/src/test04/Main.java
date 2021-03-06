package test04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        //ClassLoader cl = ClassLoader.getSystemClassLoader();
        //InputStream stream = cl.getResourceAsStream("test\\prop.properties");
        BufferedInputStream stream = new BufferedInputStream(new FileInputStream("day018\\src\\test04\\prop.properties"));
        InputStreamReader isr = new InputStreamReader(stream, "GBK");
        prop.load(isr);
        Class clazz = Class.forName(prop.getProperty("className"));
        Constructor clazzConstructor = clazz.getConstructor();
        Object o = clazzConstructor.newInstance();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("set")) {
                method.invoke(o, prop.getProperty(method.getName().substring(3).toLowerCase()));
            }
        }
        System.out.println(o);
    }
}
