package test04;

public class Demo {
    public static void main(String[] args) {
        Desk d = new Desk();
        Foodie f = new Foodie(d);
        Cooker c = new Cooker(d);
        f.start();
        c.start();
    }
}
