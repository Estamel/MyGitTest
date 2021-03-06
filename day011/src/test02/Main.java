package test02;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("day011\\aaa");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file,"a.txt");
        file2.createNewFile();
    }
}
