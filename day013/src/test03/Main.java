package test03;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream("D:\\测试文件夹\\test.txt"));
        OutputStream os = new BufferedOutputStream(new FileOutputStream("day013\\a.txt"));
        byte[] bytes = new byte[1024];
        int a;
        while ((a = is.read(bytes)) != -1) {
            os.write(bytes, 0, a);
        }
        is.close();
        os.close();
    }
}
