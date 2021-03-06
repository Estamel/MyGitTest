package test05;

public class Student {
    private String Name;
    private int age;

    public Student(String name, int age) {
        Name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
