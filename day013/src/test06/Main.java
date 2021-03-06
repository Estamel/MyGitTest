package test06;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream("E:\\wav\\Tr1 Scene1_オープニング.wav"));
        OutputStream os = new BufferedOutputStream(new FileOutputStream("day013\\a.wav"));
        byte[] bytes = new byte[10240];
        int a;
        while ((a=is.read(bytes))!=-1){
            os.write(bytes);
        }
        is.close();
        os.close();
    }
}
