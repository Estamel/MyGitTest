package test06;

import java.util.concurrent.CountDownLatch;

public class Son implements Runnable{
    private final int i;
    private final CountDownLatch cdl;
    public Son(int i, CountDownLatch cdl) {
        this.i = i;
        this.cdl = cdl;
    }

    @Override
    public void run() {
        for (int i1 = 1; i1 <= i; i1++) {
            System.out.println("孩子正在吃第"+i1+"个饺子");
        }
        cdl.countDown();
    }
}
