package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;

public class StudentService {
    private StudentDao sd = new StudentDao();

    public Student[] findAllStudent() {
        Student[] allStudent = sd.foundStudent();
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student stu = allStudent[i];
            if (stu != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return allStudent;
        } else {
            return null;
        }
    }

    public void deleteStudentById(String delId) {
        sd.deleteStudentById(delId);
    }

    public boolean addStudent(Student stu) {
        return sd.addStudent(stu);
    }

    public boolean isExists(String id) {
        Student[] stu = sd.foundStudent();
        boolean flag = false;
        for (int i = 0; i < stu.length; i++) {
            Student stuu = stu[i];
            if (stuu != null && stuu.getId().equals(id)) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }

    public void updateStudent(String updateId, Student newStu) {
        sd.updateStudent(updateId, newStu);
    }
}
