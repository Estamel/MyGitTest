package com.itheima.realedu.service;

import com.itheima.realedu.dao.StudentDao;
import com.itheima.realedu.domain.Student;

public class StudentService {
    private StudentDao StudentDao = new StudentDao();

    public boolean addStudent(Student stu) {
        return StudentDao.addStudent(stu);
    }

    public boolean testId(String id) {
        boolean flag = false;
        Student[] stus = StudentDao.getstu();
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null && stu.getId().equals(id)) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }

    public boolean findStudent(String id) {
        boolean flag = false;
        Student[] stus = StudentDao.getstu();
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu!=null&&stu.getId().equals(id)) {
                flag = false;
                break;
            }else {
                flag = true;
            }
        }
        return flag;
    }

    public boolean removeStudent(String id) {
        return StudentDao.removeStudent(id);
    }

    public Student[] showStudent() {
        Student[] stu = StudentDao.getstu();
        return stu;
    }


    public void reAddStudent(String id, Student stu) {
        StudentDao.reAddStudent(id,stu);
    }
}
