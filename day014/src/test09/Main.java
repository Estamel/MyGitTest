package test09;

public class Main {
    public static void main(String[] args) {
        Other o = new Other();
        Thread t1 = new Thread(o,"坦克");
        Thread t2 = new Thread(o,"飞机");
        t1.start();
        t2.start();
    }
}
