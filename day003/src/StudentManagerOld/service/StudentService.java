package StudentManagerOld.service;

import StudentManagerOld.dao.StudentDao;
import StudentManagerOld.domain.Student;

public class StudentService {
    StudentDao dao = new StudentDao();
    public boolean addStudent(Student stu) {
        return dao.addStudent(stu);
    }

    public Student[] findStudent() {
        return dao.findStudent();
    }

    public boolean anyStudent(String id) {
        Student[] stus= dao.findStudent();
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            Student s = stus[i];
            if (stus[i]!=null&&s.getId().equals(id)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void deletStudent(String a) {
        dao.deletStudent(a);
    }

    public void reAddStudent(Student stu,String a) {
        dao.reAddStudent(stu,a);
    }
}
