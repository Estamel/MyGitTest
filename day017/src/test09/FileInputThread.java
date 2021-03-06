package test09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.UUID;

public class FileInputThread implements Runnable {
    private Socket accept;

    public FileInputThread(Socket ss) {
        this.accept = ss;
    }

    @Override
    public void run() {
        BufferedOutputStream bos = null;
        try {
            BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
            bos = new BufferedOutputStream(new FileOutputStream("D:\\测试文件夹\\云端\\" + UUID.randomUUID() + ".txt"));
            byte[] b = new byte[1024];
            while ((bis.read(b)) != -1) {
                bos.write(b);
                bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos!=null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (accept!=null) {
                    accept.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
