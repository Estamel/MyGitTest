package test01;

public class Box<E> {
    private E content;

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public Box() {
    }

    @Override
    public String toString() {
        return "Box{" +
                "content=" + content +
                '}';
    }

    public Box(E content) {
        this.content = content;
    }
}
