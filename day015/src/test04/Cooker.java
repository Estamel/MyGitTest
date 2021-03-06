package test04;

public class Cooker extends Thread{
    private final Desk d;
    public Cooker(Desk d) {
        this.d = d;
    }
    public void run(){
        synchronized (d.getObj()) {
            while (true) {
                if (d.getCount()==0) {
                    break;
                }else if (!d.isCake()) {
                    System.out.println("厨师做蛋糕");
                    d.setCake(true);
                    d.getObj().notifyAll();
                } else if (d.isCake()) {
                    try {
                        d.getObj().wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
