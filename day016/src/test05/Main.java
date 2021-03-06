package test05;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, String> ch = new ConcurrentHashMap<>(10);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                ch.put(i + "", i + "");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 100; i < 200; i++) {
                ch.put(i + "", i + "");
            }
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);
    }
}
