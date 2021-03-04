package test01;

import java.util.concurrent.atomic.AtomicInteger;

public class TextT{
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public TextT(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }

    public TextT() {
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public void setAtomicInteger(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }
}
