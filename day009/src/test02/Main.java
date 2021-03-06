package test02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        String e1 = "a";
        String e2 = "b";
        String e3 = "c";
        String e4 = "d";
        ArrayList<String> arrayList = addElement(arr, e1, e2, e3, e4);
        System.out.println(arrayList.toString());
    }

    public static  <E> ArrayList<E> addElement(ArrayList<E> list, E e1, E e2, E e3, E e4) {
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        return list;
    }
}
