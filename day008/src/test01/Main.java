package test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
