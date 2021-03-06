package test2;

public interface InterB {
    public static void show(){
        System.out.println("InterB---Show");
    }

    public default void method1(){
        System.out.println("接口InterB中默认方法");
    }
}
