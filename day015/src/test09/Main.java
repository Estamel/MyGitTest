package test09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService exe= Executors.newCachedThreadPool();
        exe.submit(()-> System.out.println("执行了"));
        exe.shutdown();
    }
}