package test4;

public class BasketballPlayer extends Person implements Swimming {
    @Override
    public void study() {
        System.out.println("篮球运动员学习");
    }

    @Override
    public void swimming() {
        System.out.println("篮球运动员游泳");
    }
}
