package com.itheima.realedu.dao;

import com.itheima.realedu.domain.Student;

public class StudentDao {
    private static Student[] stus = new Student[5];

    public boolean addStudent(Student stu) {
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] == null) {
                stus[i] = stu;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Student[] getstu() {
        return stus;
    }

    public int findIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean removeStudent(String id) {
        int a = findIndex(id);
        stus[a] = null;
        return true;
    }

    public void reAddStudent(String id, Student stu) {
        int index = findIndex(id);
        stus[index]=stu;
    }
}
