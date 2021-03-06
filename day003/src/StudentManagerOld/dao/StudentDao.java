package StudentManagerOld.dao;

import StudentManagerOld.domain.Student;

public class StudentDao {
    private Student[] stus = new Student[5];
    public boolean addStudent(Student stu) {
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            if (stus[i]==null) {
                stus[i]=stu;
                flag = true;
                break;
            }else {
                flag = false;
            }
        }
        return flag;
    }

    public Student[] findStudent() {
        return stus;
    }

    public void deletStudent(String a) {
        for (int i = 0; i < stus.length; i++) {
            Student s = stus[i];
            if (stus[i]!=null&&s.getId().equals(a)){
                stus[i]=null;
                break;
            }
        }
    }

    public void reAddStudent(Student stu,String id) {
        int index = 0;
        for (int i = 0; i < stus.length; i++) {
            Student s = stus[i];
            if (stus[i] != null && s.getId().equals(id)) {
                index = i;
                break;
            }
        }
        stus[index]=stu;
    }
}
