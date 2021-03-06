package test05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\测试文件夹\\test.txt"));
        System.out.println(ois.readObject());
        ois.close();
    }
}
