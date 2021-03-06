package test05;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> arr = new ArrayBlockingQueue<>(1);
        Foodie f = new Foodie(arr);
        Cooker c = new Cooker(arr);
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
