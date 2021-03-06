package test03;

public class Test2 implements TestI<String> {
    @Override
    public void methord(String string) {
        System.out.println(string);
    }
}
