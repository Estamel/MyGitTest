package test04;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ServerThread implements Runnable{
    private Socket ss;
    private BufferedOutputStream bos = null;
    public ServerThread(Socket ss) {
        this.ss = ss;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = ss.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(inputStream);
            bos = new BufferedOutputStream(new FileOutputStream("D:\\测试文件夹\\真云\\"+ UUID.randomUUID()+".mp4"));
            byte[] b = new  byte[1024];
            while ((bis.read(b))!=-1){
                bos.write(b,0,b.length);
            }
            bos.flush();
            OutputStream outputStream = ss.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(outputStream);
            byte[] bytes = "传输完毕".getBytes();
            bos.write(bytes);
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
