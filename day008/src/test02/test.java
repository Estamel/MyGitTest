package test02;

import java.util.ArrayList;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        Iterator<String> i = arr.iterator();
        while (i.hasNext()) {
            String s = i.next();
            if ("b".equals(s)) {
                i.remove();
            }
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
