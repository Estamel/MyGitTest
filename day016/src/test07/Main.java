package test07;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        for (int i = 0; i < 100; i++) {
            Thread t1 = new Thread(c);
            t1.start();
        }
    }
}
