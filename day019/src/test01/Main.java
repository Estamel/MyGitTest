package test01;

public class Main {
    public static void main(String[] args) {
        TextT t1 = new TextT();
        TestT1 t = new TestT1(t1.getAtomicInteger());
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t2.start();
        t3.start();
    }
}
