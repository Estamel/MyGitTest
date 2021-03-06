package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {
    StudentService ss = new StudentService();
    Scanner sc = new Scanner(System.in);

    public void start() {
        loop:
        while (true) {
            System.out.println("欢迎来到学生信息管理系统");
            System.out.println("请输入你的选择1.添加学生2.删除学生3.修改学生4.查看学生5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("添加");
                    addStudent();
                    break;
                case "2":
                    System.out.println("删除");
                    studentDelete();
                    break;
                case "3":
                    System.out.println("修改");
                    updateStudent();
                    break;
                case "4":
                    System.out.println("查看");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("退出");
                    break loop;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }
    }

    private void updateStudent() {
        String updateId;
        while (true) {
            System.out.println("请输入待修改的学生ID");
            updateId = sc.next();
            boolean exists = ss.isExists(updateId);
            if (!exists) {
                System.out.println("输入的ID不存在");
            } else {
                break;
            }
        }
        System.out.println("enter name");
        String name = sc.next();
        System.out.println("enter age");
        String age = sc.next();
        System.out.println("enter birthday");
        String birth = sc.next();
        Student newStu = new Student();
        newStu.setName(name);
        newStu.setAge(age);
        newStu.setBirthday(birth);
        ss.updateStudent(updateId, newStu);
        System.out.println("success");
    }

    private void studentDelete() {
        Student[] allStudent = ss.findAllStudent();
        if (allStudent == null) {
            System.out.println("查无信息");
            return;
        }
        String delId;
        while (true) {
            System.out.println("请输入ID");
            delId = sc.next();
            boolean exists = ss.isExists(delId);
            if (!exists) {
                System.out.println("不存在");
            } else {
                break;
            }
        }
        ss.deleteStudentById(delId);
        System.out.println("success");
    }

    private void findAllStudent() {
        Student[] stus = ss.findAllStudent();
        if (stus == null) {
            System.out.println("查无信息请添加后重试");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null) {
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
            }
        }
    }

    public void addStudent() {
        String id = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id");
        while (true) {
            id = sc.next();
            boolean result = ss.isExists(id);
            if (result) {
                break;
            } else {
                System.out.println("请重新输入");
            }
        }
        System.out.println("enter name");
        String name = sc.next();
        System.out.println("enter age");
        String age = sc.next();
        System.out.println("enter birthday");
        String birth = sc.next();
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birth);
        boolean result = ss.addStudent(stu);
        if (result) {
            System.out.println("success");
        } else {
            System.out.println("no");
        }
    }
}
