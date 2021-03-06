package test05;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        OutputStream oss = new BufferedOutputStream(new FileOutputStream("day013\\a.txt"));
        oss.write("姓名：田所浩二\r\n年龄：24".getBytes());
        oss.close();
        InputStream is = new BufferedInputStream(new FileInputStream("day013\\a.txt"));
        OutputStream os = new BufferedOutputStream(new FileOutputStream("day013\\b.txt"));
        int a;
        while ((a=is.read())!=-1){
            os.write(a);
        }
        is.close();
        os.close();
    }
}
