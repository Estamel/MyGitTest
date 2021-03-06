package test03;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\360驱动大师目录");
        findAndDelete(file);
    }

    private static void findAndDelete(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                file1.delete();
            }else {
                findAndDelete(file1);
            }
        }
        file.delete();
    }
}
