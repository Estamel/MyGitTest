package test1;

public class test21 extends test22 {
    private int score;

    public test21(String name,int age,int score) {
        super(name,age);
        this.score = score;
    }

    public test21() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
