package test05;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker implements Runnable{
    private final ArrayBlockingQueue<String> arr;

    public Cooker(ArrayBlockingQueue<String> arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        while (true){
            try {
                arr.put("小汉堡");
                System.out.println("老八造小汉堡");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
