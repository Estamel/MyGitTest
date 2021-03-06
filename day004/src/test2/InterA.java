package test2;

public interface InterA {
    public static void show(){
        System.out.println("InterA---Show");
    }

    public default void method1(){
        System.out.println("接口InterA中默认方法");
    }
}
