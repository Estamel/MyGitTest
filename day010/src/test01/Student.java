package test01;

import java.util.Objects;

public class Student {
    private String Name;
    private int Age;

    public Student(String name, int age) {
        Name = name;
        Age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Age == student.Age &&
                Objects.equals(Name, student.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Student() {
    }
}
