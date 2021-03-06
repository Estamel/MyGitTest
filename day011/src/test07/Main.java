package test07;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\测试文件夹\\aaa");
        file.mkdirs();
        File file1 = new File("D:\\测试文件夹\\aaa\\test.txt");
        file1.createNewFile();
    }
}
