package test13;

import java.util.concurrent.Callable;

public class Other implements Callable<String> {
    @Override
    public String call() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
        return Thread.currentThread().getName()+"执行完毕";
    }
}
