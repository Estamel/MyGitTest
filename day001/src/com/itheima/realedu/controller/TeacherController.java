package com.itheima.realedu.controller;

import com.itheima.realedu.domain.Student;
import com.itheima.realedu.service.StudentService;

import java.util.Scanner;

public class TeacherController extends StudentController {
    private StudentService StudentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    @Override
    public void addStudent() {
        String Id;
        while (true) {
            System.out.println("请输入教师编号");
            Id = sc.next();
            boolean flag = StudentService.testId(Id);
            if (flag) {
                break;
            }else {
                System.out.println("输入编号重复，请重新输入");
            }
        }
        System.out.println("请输入教师姓名");
        String Name = sc.next();
        System.out.println("请输入教师年龄");
        String Age = sc.next();
        System.out.println("请输入教师生日");
        String Birthday = sc.next();
        Student stu = new Student(Id,Name,Age,Birthday);
        if(StudentService.addStudent(stu)){
            System.out.println("添加成功");
        }else {
            System.out.println("系统已经满啦");
        }
    }
}
