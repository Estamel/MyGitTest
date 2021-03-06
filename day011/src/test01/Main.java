package test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<>();
        arr.add("张国立");
        arr.add("张晋");
        arr.add("刘毅");
        arr.add("郑伊健");
        arr.add("徐峥");
        arr.add("王宝强");
        Collection<String> arr2 = new ArrayList<>();
        arr2.add("郑爽");
        arr2.add("杨紫");
        arr2.add("关晓彤");
        arr2.add("张天爱");
        arr2.add("杨幂");
        arr2.add("赵丽颖");
        Stream<String> stream1 = arr.stream().filter(s -> s.length() == 3).limit(2);
        Stream<String> stream2 = arr2.stream().filter(s -> s.startsWith("杨")).skip(1);
        Stream.concat(stream1, stream2).forEach(s -> System.out.println(new Actor(s)));
    }
}
