package test04;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        callto ct = new callto();
        FutureTask<String> ft= new FutureTask<>(ct);
        Thread t = new Thread(ft);
        t.start();
        System.out.println(ft.get());
    }
}
