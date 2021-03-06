package test05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("a");
        li.add("b");
        li.add("c");
        li.add("d");
        li.add("e");
        Iterator<String> iterator = li.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        Iterator<String> iterator2 = li.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().equals("c")) {
                iterator2.remove();
            }
        }
        for (String s : li) {
            System.out.print(s+" ");
        }
        Iterator<String> iterator1 = li.iterator();

    }
}
