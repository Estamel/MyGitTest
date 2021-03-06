package StudentManagerOld.entry;

import StudentManagerOld.controller.StudentController;
import StudentManagerOld.controller.TeacherController;

import java.util.Scanner;

public class InfoStudentEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------欢迎来到人员管理系统-------------");
        System.out.println("   1，学生管理系统 2，教师管理系统 3，退出系统");
        while (true){
            String a = sc.next();
            switch (a){
                case "1":
                    //学生管理系统
                    StudentController scc = new StudentController();
                    scc.BaseController();
                case "2":
                    //教师管理系统
                    TeacherController tea = new TeacherController();
                    tea.BaseController();
                case "3":
                    System.exit(0);
                default:
                    System.out.println("您的输入有误，请重新输入");
            }
        }
    }
}
