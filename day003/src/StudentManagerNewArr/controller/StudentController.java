package StudentManagerNewArr.controller;

import StudentManagerNewArr.domain.Student;
import StudentManagerNewArr.service.SystemService;

import java.util.Scanner;

public class StudentController extends SystemController {
    Scanner sc = new Scanner(System.in);
    //SystemService SystemService = new SystemService();

    public void StudentController() {//StudentController的主入口，负责检测用户想要执行的方法
        System.out.println("欢迎来到学生管理系统");
        loop:
        while (true) {
            System.out.println("1.增加学生 2.删除学生 3.修改学生 4.显示所有学生 5.退出系统");
            int choic = sc.nextInt();
            switch (choic) {
                case 1:
                    //增加学生
                    addStudent();
                    break;
                case 2:
                    //删除学生
                    deleteStudent();
                    break;
                case 3:
                    //修改学生
                    reAddStudent();
                    break;
                case 4:
                    //显示所有学生
                    showStudent();
                    break;
                case 5:
                    //退出学生管理系统
                    break loop;
                default:
                    System.out.println("您的输入有误，请重新输入");
            }
        }
    }

    public void reAddStudent() {
        String id;
        while (true) {
            System.out.println("请输入想要修改的学生编号");
            id = sc.next();
            if (SystemService.checkId(id)) {
                System.out.println("未检测到学号，请核对后重新输入");
            } else {
                break;
            }
        }
        Student stu = advanceGetStudent();
        SystemService.reAddStudent(stu, id);
        System.out.println("修改完成");
    }

    public void deleteStudent() {
        String id;
        while (true) {
            System.out.println("请输入学生编号");
            id = sc.next();
            if (SystemService.checkId(id)) {
                System.out.println("未检测到学号，请核对后重新输入");
            } else {
                break;
            }
        }
        SystemService.deleteStudent(id);
        System.out.println("删除成功");
    }

    public Student getStudent() {
        String id;
        while (true) {
            System.out.println("请输入学生编号");
            id = sc.next();
            if (SystemService.checkId(id)) {
                break;
            } else {
                System.out.println("检测到学号重复，请核对后重新输入");
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthDay = sc.next();
        return new Student(id, name, age, birthDay);
    }

    public Student advanceGetStudent() {
        System.out.println("请输入学生编号");
        String id = sc.next();
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthDay = sc.next();
        return new Student(id, name, age, birthDay);
    }
}
