package test13;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Other o = new Other();
        FutureTask<String> ft = new FutureTask<>(o);
        FutureTask<String> ft2 = new FutureTask<>(o);
        Thread t1 = new Thread(ft,"好困");
        Thread t2 = new Thread(ft2,"好累");
        t1.start();
        t2.start();
        System.out.println(ft.get());
        System.out.println(ft2.get());
    }
}
