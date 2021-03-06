package test09;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put(".txt", 0);
        m.put(".png", 0);
        m.put("other", 0);
        File file = new File("D:\\测试文件夹");
        countFile(file, m);
        System.out.println(m);
    }

    private static void countFile(File file, Map<String, Integer> m) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    countFile(file1, m);
                } else if (file1.getName().endsWith(".txt")) {
                    Integer integer = m.get(".txt");
                    integer += 1;
                    m.put(".txt", integer);
                } else if (file1.getName().endsWith(".png")) {
                    Integer integer = m.get(".png");
                    integer += 1;
                    m.put(".png", integer);
                } else {
                    Integer integer = m.get("other");
                    integer += 1;
                    m.put("other", integer);
                }
            }
        }
    }
}
