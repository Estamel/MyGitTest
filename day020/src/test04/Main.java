package test04;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        InputStream stream = cl.getResourceAsStream("location.properties");
        InputStreamReader isr = new InputStreamReader(stream,"gbk");
        Properties pp = new Properties();
        pp.load(isr);
        System.out.println(pp.getProperty("姓名"));
        stream.close();
        isr.close();
    }
}
