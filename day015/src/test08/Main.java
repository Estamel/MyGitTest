package test08;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.FutureTask;

public class Main {
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
