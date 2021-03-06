package test05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User("qwer","1234");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\测试文件夹\\test.txt"));
        oos.writeObject(user);
        oos.close();
    }
}
