package test10;

public class MilkBox {
    private boolean box;

    public MilkBox(boolean box) {
        this.box = box;
    }

    public MilkBox() {
        this.box = false;
    }

    public boolean isBox() {
        return box;
    }

    public void setBox(boolean box) {
        this.box = box;
    }

}
