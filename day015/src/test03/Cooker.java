package test03;

public class Cooker extends Thread{
    public void run(){
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count != 0) {
                    if (Desk.flag) {
                        System.out.println("生产汉堡");
                        Desk.count--;
                        Desk.flag = true;
                        Desk.lock.notifyAll();
                    }else {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }else {
                    break;
                }
            }
        }
    }
}
