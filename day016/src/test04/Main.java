package test04;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(10);
        System.out.println(ai.addAndGet(10));
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"1");
        hm.put(2,"2");
        hm.put(3,"3");
        hm.put(4,"4");
        Set<Integer> integers = hm.keySet();
        for (Integer integer : integers) {
            hm.get(integer);
        }
    }
}
