package test10;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\测试文件夹\\test.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("wdnmd".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
