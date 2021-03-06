package com.itheima.edu.info.manager.entry;

import com.itheima.edu.info.manager.controller.StudentController;

import java.util.Scanner;

public class InfoStudentEnety {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------黑马信息管理系统----------");
        System.out.println("请输入你的选择:1.学生管理 2.老师管理 3.退出");
        while (true) {
            String a = sc.next();
            switch (a) {
                case "1":
                    System.out.println("学生管理");
                    StudentController b = new StudentController();
                    b.start();
                case "2":
                    System.out.println("老师管理");
                case "3":
                    System.out.println("退出");
                    System.exit(0);
                default:
                    System.out.println("您的输入有误");
            }
        }
    }
}
