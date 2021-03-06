package test06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        es.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });
        Thread.sleep(2000);
        es.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });
        es.shutdown();
    }
}
