package test1;

public class Zi extends Fu {
    public void show(){
        System.out.println("子类shouw方法");
    }
    public void mathod(){
        this.show();
        super.show();
    }
}
