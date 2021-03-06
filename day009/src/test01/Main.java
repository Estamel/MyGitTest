package test01;

public class Main {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.setContent("WDNMD");
        System.out.println(b.getContent());
        Box<Integer> a = new Box<>();
        a.setContent(666);
        System.out.println(a.toString());
    }
}
