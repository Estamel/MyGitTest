package test04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> cl = new ArrayList<>();
        cl.add("aaa");
        cl.add("bbb");
        cl.add("ccc");
        cl.add("ddd");
        Iterator<String> iterator = cl.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        for (String s : cl) {
            System.out.print(s+" ");
        }
        System.out.println();
        Iterator<String> iterator1 = cl.iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals("ccc")) {
                iterator1.remove();
            }
        }
        for (String s : cl) {
            System.out.print(s+" ");
        }
    }
}
