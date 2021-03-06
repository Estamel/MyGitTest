package test01;

import java.util.concurrent.CountDownLatch;

public class MotherRunnable implements Runnable{
    private final CountDownLatch cd;
    public MotherRunnable(CountDownLatch cd) {
        this.cd = cd;
    }

    @Override
    public void run() {
        try {
            cd.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("收拾碗筷");
    }
}
