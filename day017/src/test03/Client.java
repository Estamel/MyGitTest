package test03;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.31.67", 10001);
        BufferedInputStream br = new BufferedInputStream(new FileInputStream("C:\\Users\\MADOKA\\Desktop\\图\\11.jpg"));
        BufferedOutputStream outputStream = new BufferedOutputStream(s.getOutputStream());
        int a;
        while ((a = br.read()) != -1) {
            outputStream.write(a);
        }
        outputStream.flush();
        s.shutdownOutput();
        InputStream inputStream = s.getInputStream();
        BufferedReader brr = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line=brr.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        s.close();
    }
}
