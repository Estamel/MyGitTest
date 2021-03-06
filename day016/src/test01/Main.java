package test01;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        CountDownLatch cd = new CountDownLatch(3);
        MotherRunnable mr = new MotherRunnable(cd);
        ChildRunnable cr = new ChildRunnable(cd,5);
        Thread t1 = new Thread(cr,"小红");
        Thread t2 = new Thread(cr,"小明");
        Thread t3 = new Thread(cr,"小白");
        Thread t4 = new Thread(mr);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
