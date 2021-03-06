package test01;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> liv = new ArrayList<>(List.of("柳岩","杨幂","迪丽热巴","舒淇","龚玥菲","杨思敏"));
        List<String> lin = new ArrayList<>(List.of("彭于晏","吴彦祖","刘德华","黎明","成龙","王宝强","王国强"));
        Stream<String> stream1 = liv.stream().skip(2).filter(s -> !s.startsWith("杨"));
        Stream<String> stream2 = lin.stream().limit(5).filter(s -> !(s.length() ==2));
        Stream.concat(stream1,stream2).forEach(s -> System.out.println(s));
    }
}
