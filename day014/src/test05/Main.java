package test05;

import java.util.Properties;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("itheima001", "佟");
        p.setProperty("itheima002", "佟丽");
        p.setProperty("itheima003", "佟丽娅");
        Set<String> objects = p.stringPropertyNames();
        for (String object : objects) {
            System.out.println(object);
            System.out.println(p.getProperty(object));
        }
    }
}
