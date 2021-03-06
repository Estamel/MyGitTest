package StudentManagerNewArr.service;

import StudentManagerNewArr.dao.BaseDao;
import StudentManagerNewArr.domain.Student;
import StudentManagerNewArr.factory.DaoFactory;

import java.util.ArrayList;

public class SystemService {
    BaseDao SystemDao = DaoFactory.DaoFactory();

    public void addStudent(Student stu) {
        SystemDao.addStudent(stu);
    }

    public boolean checkId(String id) {
        ArrayList<Student> arr = SystemDao.getStus();
        boolean flag = true;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != null && arr.get(i).getId().equals(id)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public ArrayList<Student> showStudent() {
        ArrayList<Student> arr = SystemDao.getStus();
        return arr;
    }

    public void deleteStudent(String id) {
        SystemDao.deleteStudent(id);
    }

    public void reAddStudent(Student stu, String id) {
        SystemDao.reAddStudent(stu, id);
    }
}
