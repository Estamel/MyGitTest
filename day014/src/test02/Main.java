package test02;

import java.io.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("day014\\prop.properties");
        properties.load(fis);
        System.out.println(properties);
        fis.close();
    }
}
