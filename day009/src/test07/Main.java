package test07;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> a = new TreeSet<>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String s : a) {
            System.out.println(s);
        }
    }
}
