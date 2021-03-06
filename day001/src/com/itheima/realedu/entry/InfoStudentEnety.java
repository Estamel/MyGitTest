package com.itheima.realedu.entry;

import com.itheima.realedu.controller.StudentController;
import com.itheima.realedu.controller.TeacherController;

import java.util.Scanner;

public class InfoStudentEnety {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到人员管理系统");
            while (true) {
                String code = "admin";
                String code2 = "1234";
                System.out.println("请输入账号");
                String a = sc.next();
                System.out.println("请输入密码");
                String b = sc.next();
                if (a.equals(code)&&b.equals(code2)) {
                    break;
                }else {
                    System.out.println("账号/密码错误，请重新输入");
                }
            }
            System.out.println("1,学生管理系统 2，老师管理系统 3，退出");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    StudentController s = new StudentController();
                    s.StudentController();
                    break;
                case 2:
                    TeacherController t = new TeacherController();
                    t.StudentController();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("您的输入有误");
            }
        }
    }
}
