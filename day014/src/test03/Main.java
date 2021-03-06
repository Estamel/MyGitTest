package test03;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        MyThread mt2 = new MyThread();
        mt2.start();
    }
}
