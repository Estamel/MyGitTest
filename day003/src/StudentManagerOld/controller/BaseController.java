package StudentManagerOld.controller;

import StudentManagerOld.domain.Student;
import StudentManagerOld.service.StudentService;

import java.util.Scanner;

public abstract class BaseController {
    private Scanner sc = new Scanner(System.in);
    StudentService ss = new StudentService();
    public abstract void BaseController();
    public abstract void reAddStudent();
    public abstract void deletStudent();
    public void addStudent(){
        System.out.println(ss.addStudent(getStudent()));
    }

    public abstract Student getStudent();
    public void findStudent(){
        System.out.println("编号\t\t姓名\t\t年龄\t\t生日");
        Student[] stu = ss.findStudent();
        Student s;
        for (int i = 0; i < stu.length; i++) {
            s = stu[i];
            if (s!=null) {
                System.out.println(s.getId() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getBirthday());
            }
        }
    }
}
