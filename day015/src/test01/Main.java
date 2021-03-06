package test01;

public class Main {
    public static void main(String[] args) {
        xiancheng x = new xiancheng();
        Thread t1 = new Thread(x);
        Thread t2 = new Thread(x);
        Thread t3 = new Thread(x);
        t1.setName("窗口1  ");
        t2.setName("窗口2  ");
        t3.setName("窗口3  ");
        t1.start();
        t2.start();
        t3.start();
    }
}
