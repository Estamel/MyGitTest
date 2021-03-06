package test03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);
        Socket accept = ss.accept();
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\测试文件夹\\aaa\\副本.png"));
        int a;
        while ((a=bis.read())!=-1){
            bos.write(a);
        }
        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("传输成功");
        bw.newLine();
        bw.flush();
        bos.close();
        accept.close();
        ss.close();
    }
}
