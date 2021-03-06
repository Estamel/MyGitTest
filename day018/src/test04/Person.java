package test04;

public class Person {
    private String name;
    private String address;
    private String job;

    public Person() {
    }

    public Person(String name, String address, String job) {
        this.name = name;
        this.address = address;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + address +
                ", job='" + job + '\'' +
                '}';
    }
}
