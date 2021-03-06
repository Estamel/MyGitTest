package com.itheima.realedu.controller;

import com.itheima.realedu.domain.Student;
import com.itheima.realedu.service.StudentService;

import java.util.Scanner;

public abstract class Controller {
    private Scanner sc = new Scanner(System.in);
    private StudentService StudentService = new StudentService();
    final public void StudentController() {
        System.out.println("欢迎来到人员管理系统");
        loop:while (true) {
            System.out.println("1,添加 2,删除 3,修改 4,查找 5,退出系统");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    //添加
                    addStudent();
                    break;
                case 2:
                    //删除
                    removeStudent();
                    break;
                case 3:
                    reAddStudent();
                    break;
                case 4:
                    //查
                    showStudent();
                    break;
                case 5:
                    System.out.println("退出系统");
                    break loop;
                default:
                    System.out.println("您的输入有误");
            }
        }
    }

    final public void reAddStudent() {
        String id;
        System.out.println("请输入想要修改的编号");
        while (true) {
            id = sc.next();
            boolean flag = StudentService.findStudent(id);
            if (flag) {
                System.out.println("未找到指定编号，请重新输入编号");
            } else {
                break;
            }
        }
        Student stu = getStudent();
        StudentService.reAddStudent(id,stu);
        System.out.println("修改成功");
    }

    final public void showStudent() {
        Student[] stu = StudentService.showStudent();
        for (int i = 0; i < stu.length; i++) {
            Student stuu = stu[i];
            if (stuu != null) {
                System.out.println(stuu.getId() + "  " + stuu.getName() + "  " + stuu.getAge() + "  " + stuu.getBirthday());
            }
        }
    }

    final public void removeStudent() {
        String id;
        System.out.println("请输入您想移除的编号");
        while (true) {
            id = sc.next();
            boolean flag = StudentService.findStudent(id);
            if (flag) {
                System.out.println("未找到指定编号，请重新输入编号");
            }else {
                break;
            }
        }
        boolean flag = StudentService.removeStudent(id);
        if (flag) {
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }

    public abstract void addStudent();

    final public Student getStudent() {
        String Id;
        Student stu = new Student();
        while (true) {
            System.out.println("请输入学生编号");
            Id = sc.next();
            boolean flag = StudentService.testId(Id);
            if (flag) {
                break;
            }else {
                System.out.println("输入编号重复，请重新输入");
            }
        }
        System.out.println("请输入学生姓名");
        String Name = sc.next();
        System.out.println("请输入学生年龄");
        String Age = sc.next();
        System.out.println("请输入学生生日");
        String Birthday = sc.next();
        stu.setId(Id);
        stu.setName(Name);
        stu.setAge(Age);
        stu.setBirthday(Birthday);
        return stu;
    }
}
