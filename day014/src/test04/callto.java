package test04;

import java.util.concurrent.Callable;

public class callto implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("我带你们打第"+i+"次");
        }
        return "你赢了";
    }
}
