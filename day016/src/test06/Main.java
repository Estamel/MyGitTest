package test06;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(2);
        Son s1 = new Son(10,cdl);
        Son s2 = new Son(10,cdl);
        Mother m = new Mother(cdl);
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(m);
        t1.start();
        t2.start();
        t3.start();
    }
}
