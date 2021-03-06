package test05;

public class Desk {
    private boolean cake;
    private int count;
    private final Object obj = new Object();

    public Desk() {
        this.cake=false;
        this.count = 10;
    }

    public boolean isCake() {
        return cake;
    }

    public void setCake(boolean cake) {
        this.cake = cake;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getObj() {
        return obj;
    }
}
