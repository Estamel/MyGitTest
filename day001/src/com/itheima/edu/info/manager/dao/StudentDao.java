package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao {
    private static Student[] stuu = new Student[5];

    public void updateStudent(String updateId, Student newStu) {
        int index = getIndex(updateId);
        stuu[index] = newStu;
    }

    public Student[] foundStudent() {
        return stuu;
    }

    public void deleteStudentById(String delId) {
        int index = getIndex(delId);
        stuu[index] = null;
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stuu.length; i++) {
            Student stu = stuu[i];
            if (stu != null && stu.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean addStudent(Student stu) {
        int index = -1;
        for (int i = 0; i < stuu.length; i++) {
            if (stuu[i] == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("full");
            return false;
        } else {
            stuu[index] = stu;
            return true;
        }
    }
}
