package test03;

public class Test<E> implements TestI<E> {
    @Override
    public void methord(E e) {
        System.out.println(e);
    }
}
