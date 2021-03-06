package test06;

import java.util.concurrent.CountDownLatch;

public class Mother implements Runnable{
    private final CountDownLatch cdl;
    public Mother(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("收拾碗筷");
    }
}
