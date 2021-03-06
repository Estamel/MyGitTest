package test08;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker implements Runnable {
    ArrayBlockingQueue<String> arr;

    public Cooker(ArrayBlockingQueue<String> arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                arr.put("小汉堡");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("做小汉堡");
        }
    }
}
