package Test02;

public class Test {
    public static void main(String[] args) {
        goSwimming(new Swimming() {
            @Override
            public void goSwimming() {
                System.out.println("游泳");
            }
        });
        goSwimming(() -> System.out.println("自由泳"));
        Swim sw = new Swim();//Swimming 是 Swim的父类，用Swimming接就构成了多态
        Swimming sww = sw;
        goSwimming(sw);
        goSwimming(sww);
        Swimming sw2 = new Swimming() {
            @Override
            public void goSwimming() {
                System.out.println("不游了");
            }
        };
        goSwimming(sw2);
    }

    public static void goSwimming(Swimming Swimming) {//多态
        Swimming.goSwimming();//调用子类函数
    }
}

interface Swimming {
    void goSwimming();
}