package test06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.setProperty("itheima003", "佟丽娅");
        FileOutputStream fos = new FileOutputStream("day014\\prop.properties");
        p.store(fos,null);
        fos.close();
        Properties p2 = new Properties();
        FileInputStream fis = new FileInputStream("day014\\prop.properties");
        p2.load(fis);
        fis.close();
        Set<String> strings = p2.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string);
            System.out.println(p2.getProperty(string));
        }
    }
}
