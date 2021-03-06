package test05;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie implements Runnable{
    private final ArrayBlockingQueue<String> arr;

    public Foodie(ArrayBlockingQueue<String> arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        while (true){
            try {
                String take = arr.take();
                System.out.println("吃货将"+take+"拿出来吃了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
