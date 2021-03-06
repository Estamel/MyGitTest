package test01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Outer.inner i = new Outer().new inner();
        System.out.println(i.num);
        i.show();
        ArrayList<String> aa = new ArrayList<>();
    }
}

class Outer{
    private int a = 10;
    class inner{
        int num = 10;
        public void show(){
            System.out.println("inner show");
            System.out.println(a);
        }
    }
}