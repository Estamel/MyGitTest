package test06;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        File fin = new File("D:\\测试文件夹\\本地");
        System.out.println(fin.toString().length());
    }
}
