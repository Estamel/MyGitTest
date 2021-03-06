package test03;

public class Foodie extends Thread{
    public void run(){
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count != 0) {
                    if (!Desk.flag) {
                        System.out.println("吃汉堡");
                        Desk.flag = false;
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
