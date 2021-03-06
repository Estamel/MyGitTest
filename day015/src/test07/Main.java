package test07;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                8,
                16,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        tpe.submit(() -> {
            System.out.println("任务执行了！！！！");
        });
        tpe.shutdown();
    }
}
