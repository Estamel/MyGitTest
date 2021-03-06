package com.itheima.realedu.controller;

import com.itheima.realedu.domain.Student;
import com.itheima.realedu.service.StudentService;

public class StudentController extends Controller {
    @Override
    public void addStudent() {
        StudentService StudentService = new StudentService();
        Student stu = getStudent();
        if(StudentService.addStudent(stu)){
            System.out.println("添加成功");
        }else {
            System.out.println("系统已经满啦");
        }
    }
}