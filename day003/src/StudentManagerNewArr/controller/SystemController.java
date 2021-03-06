package StudentManagerNewArr.controller;

import StudentManagerNewArr.domain.Student;
import StudentManagerNewArr.service.SystemService;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class SystemController {
    Scanner sc = new Scanner(System.in);
    StudentManagerNewArr.service.SystemService SystemService = new SystemService();

    public abstract void StudentController();//StudentController的主入口，负责检测用户想要执行的方法

    public abstract void reAddStudent();

    public abstract void deleteStudent();

    public void showStudent() {
        System.out.println("学号\t\t\t\t姓名\t\t\t年龄\t\t生日");
        ArrayList<Student> arr = SystemService.showStudent();
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getId() + "\t\t" + arr.get(i).getName() + "\t\t" + arr.get(i).getAge() + "\t\t" + arr.get(i).getBirthday());
        }
    }

    public void addStudent() {
        Student stu = getStudent();
        SystemService.addStudent(stu);
        System.out.println("添加成功！");
    }

    public abstract Student getStudent();

    public abstract Student advanceGetStudent();
}
