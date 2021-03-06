package StudentManagerNewArr.entry;

import StudentManagerNewArr.controller.StudentController;
import StudentManagerNewArr.controller.TeacherController;

import java.util.Scanner;

public class SystemEntry {
    public static void main(String[] args) {//这是程序的主入口，我们要新建一个使用ArrayList的人员信息管理系统
        Scanner sc = new Scanner(System.in);//调用Scanner方法
        System.out.println("欢迎来到Estamel的人员管理小程序");
        while (true) {//将程序用死循环包裹，可以重复使用
            System.out.println("1.学生信息管理系统 2.教师信息管理系统 3.退出系统");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //学生信息管理
                    StudentController StudentController = new StudentController();//new一个新的StudentController对象，准备调用其方法
                    StudentController.StudentController();//调用主题方法
                    break;
                case 2:
                    //教师信息管理
                    TeacherController TeacherController = new TeacherController();
                    TeacherController.StudentController();
                    break;
                case 3:
                    //退出程序，程序全部关闭
                    System.exit(0);
                default:
                    //添加default确保用户的正确输入
                    System.out.println("您的输入有误，请重新输入");
            }
        }
    }
}
