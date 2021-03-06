package test02;

public class Main {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();
        new Thread(()->{
            while (true) {
                synchronized (objA){
                    synchronized (objB){
                        System.out.println("走路");
                    }
                }
            }
        }).start();
        new Thread(()->{
            while (true) {
                synchronized (objB){
                    synchronized (objA){
                        System.out.println("跑步");
                    }
                }
            }
        }).start();
    }
}
