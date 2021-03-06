package test04;

public class Foodie extends Thread{
    private final Desk d;
    public Foodie(Desk d) {
        this.d = d;
    }
    public void run(){
        synchronized (d.getObj()) {
            while (true) {
                if (d.getCount()==0) {
                    break;
                }else if (d.isCake()) {
                    d.setCake(false);
                    d.setCount(d.getCount() - 1);
                    System.out.println("吃货还能吃"+d.getCount()+"块蛋糕");
                    d.getObj().notifyAll();
                }else if (!d.isCake()){
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
