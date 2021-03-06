package test05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream filei = new FileInputStream("D:\\测试文件夹\\内容\\b.png");
        FileOutputStream fileo = new FileOutputStream("day011\\b.png");
        byte[] bytes = new byte[1024];
        int b;
        while ((b = filei.read())!=-1) {
            fileo.write(bytes,0,b);
        }
        filei.close();
        fileo.close();
    }
}
