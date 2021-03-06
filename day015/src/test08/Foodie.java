package test08;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie implements Runnable {
    ArrayBlockingQueue<String> arr;

    public Foodie(ArrayBlockingQueue<String> arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("吃"+arr.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
