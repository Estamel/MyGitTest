package test10;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                4,
                8,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        MilkBox mb = new MilkBox();
        Consumer c = new Consumer(mb);
        Productor p = new Productor(mb);
        tpe.submit(c);
        tpe.submit(p);
        tpe.shutdown();
    }
}
