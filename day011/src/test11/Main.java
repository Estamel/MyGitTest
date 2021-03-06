package test11;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("D:\\测试文件夹\\test.txt")){
            fos.write("Hellow World".getBytes());
            fos.write("\r\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {

        }
    }

}
