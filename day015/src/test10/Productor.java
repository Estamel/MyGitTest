package test10;

public class Productor implements Runnable{
    private final MilkBox mb;

    public Productor(MilkBox mb) {
        this.mb = mb;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (mb) {
                if (!mb.isBox()) {
                    mb.setBox(true);
                    mb.notifyAll();
                    System.out.println(Thread.currentThread().getName() + "制造一瓶牛奶");
                } else {
                    try {
                        mb.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
