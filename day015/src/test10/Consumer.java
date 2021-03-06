package test10;

public class Consumer implements Runnable {
    private final MilkBox mb;

    public Consumer(MilkBox mb) {
        this.mb = mb;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (mb) {
                if (mb.isBox()) {
                    mb.setBox(false);
                    mb.notifyAll();
                    System.out.println(Thread.currentThread().getName() + "消费一瓶牛奶");
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
