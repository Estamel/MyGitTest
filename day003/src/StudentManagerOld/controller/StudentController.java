package StudentManagerOld.controller;

import StudentManagerOld.domain.Student;
import StudentManagerOld.service.StudentService;

import java.util.Scanner;

public class StudentController extends BaseController {
    private Scanner sc = new Scanner(System.in);
    StudentService ss = new StudentService();
    public void BaseController(){
        System.out.println("-----------------请选择想要使用的服务-----------------");
        while (true) {
            System.out.println("1，增加学生 2，删除学生 3，修改学生 4，查找学生 5，退出系统");
            String a = sc.next();
            switch (a){
                case "1":
                    //增
                    addStudent();
                    break;
                case"2":
                    //删
                    deletStudent();
                    break;
                case"3":
                    //改
                    reAddStudent();
                    break;
                case "4":
                    //查
                    findStudent();
                    break;
                case"5":
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入");
            }
        }

    }

    public void reAddStudent() {
        System.out.println("请输入待修改的学生编号");
        String a = sc.next();
        while (true) {
            if (ss.anyStudent(a)) {
                break;
            }else {
                System.out.println("未找到待修改的学生编号，请重新输入");
            }
        }
        ss.reAddStudent(getStudent(),a);
        System.out.println("修改成功");
    }

    public void deletStudent() {
        System.out.println("请输入待删除的学生编号");
        String a = sc.next();
        while (true) {
            if (ss.anyStudent(a)) {
                break;
            }else {
                System.out.println("未找到待删除的学生编号，请重新输入");
            }
        }
        ss.deletStudent(a);
        System.out.println("删除成功");
    }

    public void addStudent(){
        System.out.println(ss.addStudent(getStudent()));
    }

    public Student getStudent() {
        System.out.println("请输入待添加的学生编号");
        String id = sc.next();
        System.out.println("请输入待添加的学生姓名");
        String name = sc.next();
        System.out.println("请输入待添加的学生年龄");
        String age = sc.next();
        System.out.println("请输入待添加的学生生日");
        String birthday = sc.next();
        Student stu = new Student(id,name,age,birthday);
        return stu;
    }

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
