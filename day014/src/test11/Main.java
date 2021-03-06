package test11;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Other o = new Other();
        FutureTask<String> ft = new FutureTask<>(o);
        Thread t1 = new Thread(ft);
        t1.start();
        String s = ft.get();
        System.out.println(s);
    }
}
