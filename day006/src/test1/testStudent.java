package test1;

public class testStudent {
    public static void main(String[] args) {
        Student stu = new Student("田所浩二",24);
        Student stu1 = new Student("田所浩二",24);
        System.out.println(stu);
        System.out.println(stu.equals(stu1));
    }
}
