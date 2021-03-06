package test6;

public class mainTest2 {
    public static void main(String[] args) {
        ceshi(new Fu1() {
            @Override
            public void zhengQian() {
                
            }

            @Override
            public void chiFan() {

            }
        });
    }
    public static void ceshi(Fu1 fu){
        fu.chiFan();
        fu.zhengQian();
    }
}
