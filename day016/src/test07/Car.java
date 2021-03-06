package test07;

import java.util.concurrent.Semaphore;

public class Car implements Runnable{
    Semaphore s = new Semaphore(2);
    @Override
    public void run() {
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("汽车进入通道");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.release();
        System.out.println("汽车驶出通道");
    }
}
