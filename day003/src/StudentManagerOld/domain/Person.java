package StudentManagerOld.domain;

public class Person {
    private String Id;
    private String Name;
    private String Age;
    private String Birthday;

    public Person() {
    }

    public Person(String id, String name, String age, String birthday) {
        Id = id;
        Name = name;
        Age = age;
        Birthday = birthday;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }
}
