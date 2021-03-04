package test01;

public @interface Anno1 {
    int a () default 23;

    String name () default "itheima";

    Class clazz () default Anno2.class;

    Anno2 anno () default @Anno2;

    Season season () default Season.SPRING;

    int[] arr () default {1,2,3,4,5};

    Season[] sea () default {Season.SPRING,Season.SUMMER};

    String value();

}
