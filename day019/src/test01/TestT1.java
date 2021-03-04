package test01;

import java.util.concurrent.atomic.AtomicInteger;

public class TestT1 implements Runnable{
    private AtomicInteger atomicInteger;

    public TestT1(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(atomicInteger.getAndIncrement());
        }
    }
}
