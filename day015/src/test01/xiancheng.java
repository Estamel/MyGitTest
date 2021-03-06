package test01;

public class xiancheng implements Runnable{
    private int ticket = 10000;
    final Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (ticket>0) {
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+ticket);
                } else {
                    break;
                }
            }
        }

    }
}
