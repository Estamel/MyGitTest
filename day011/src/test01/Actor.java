package test01;

public class Actor {
    private String name;

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }
}
