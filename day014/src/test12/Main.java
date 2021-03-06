package test12;

public class Main {
    public static void main(String[] args) {
        Rtest r = new Rtest();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}
