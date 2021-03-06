package test4;

public class Test {
    public static void main(String[] args) {
        Person f = new FootballPlayer();
        Person b = new BasketballPlayer();
        userPlayer(f);
        userPlayer(b);
        Swimming Swimmer = new BasketballPlayer();
        Swimmer.swimming();
    }

    public static void userPlayer(Person p) {
        if (p instanceof FootballPlayer) {
            p.study();
            p.drink();
            ((FootballPlayer) p).sleep();
        } else {
            BasketballPlayer b = (BasketballPlayer) p;
            b.study();
            b.swimming();
            b.drink();
        }
    }
}
