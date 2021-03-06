package test01;

import java.util.concurrent.CountDownLatch;

public class ChildRunnable implements Runnable{
    private final int a;
    private final CountDownLatch cd;

    public ChildRunnable(CountDownLatch cd, int i) {
        this.cd = cd;
        this.a = i;
    }

    public void run(){
        for (int i = 1; i <= a; i++) {
            System.out.println(Thread.currentThread().getName()+"恰第"+i+"个饺子");
        }
        cd.countDown();
    }
}
