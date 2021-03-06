package test04;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream resourceAsStream = systemClassLoader.getResourceAsStream("prop.properties");
        Properties p = new Properties();
        p.load(resourceAsStream);
        System.out.println(p.getProperty("name"));
    }
}
