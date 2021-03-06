package test08;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\测试文件夹");
        findAndDelete(file);
        file.delete();
    }

    private static void findAndDelete(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()){
                findAndDelete(file1);
            }
            file1.delete();
        }
    }
}
