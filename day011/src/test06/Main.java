package test06;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\测试文件夹\\test.txt");
        file.createNewFile();
        File file1 = new File("D:\\测试文件夹\\a\\b\\c");
        file1.mkdirs();
        File file2 = new File("D:\\测试文件夹\\test.txt");
        file2.delete();
        File file3 = new File("D:\\测试文件夹");
        System.out.println(file3.isDirectory());
        System.out.println(file3.isFile());
        System.out.println(file1.isDirectory());
        System.out.println(file.exists());
        File file4 = new File("day011\\b.png");
        System.out.println(file4.getAbsolutePath());
        System.out.println(file4.getPath());
        System.out.println(file4.getName());
        File[] files = file3.listFiles();
        for (File file5 : files) {
            System.out.println(file5);
        }
    }
}
