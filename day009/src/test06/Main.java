package test06;

public class Main {
    public static void main(String[] args) {
        arr<String> a = new arr<>("qqqqq");
        System.out.println(a);
        add1 b = new add1();
        b.add("柳岩");
        Integer i = 1;
        b.add(i);
    }

}
class arr<E> {
    private E e;

    public arr(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "arr{" +
                "e=" + e +
                '}';
    }
}
class add1{
    public <E> void add(E e){
        System.out.println(e);
    }
}
