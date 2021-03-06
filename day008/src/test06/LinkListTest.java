package test06;

import java.math.BigDecimal;
import java.util.LinkedList;

public class LinkListTest {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("a");
        for (String s : ll) {
            System.out.println(s);
        }
        BigDecimal b =new BigDecimal("1.111");
        BigDecimal a =new BigDecimal("2.111");
        System.out.println(b.divide(a, 20, 4));
    }
}
