package test05;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Teacher> ts = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    result = o1.getName().compareTo(o2.getName());
                }
                return result;
            }
        });
        Teacher ts1 = new Teacher("zhangsan", 23);
        Teacher ts2 = new Teacher("lisi", 25);
        Teacher ts3 = new Teacher("wangwu", 24);
        Teacher ts4 = new Teacher("zhaoliu", 23);
        ts.add(ts1);
        ts.add(ts2);
        ts.add(ts3);
        ts.add(ts4);
        System.out.println(ts);
    }
}
