package StudentManagerNewArr.dao;

import StudentManagerNewArr.domain.Student;

import java.util.ArrayList;

public interface BaseDao {
    void addStudent(Student stu);

    ArrayList<Student> getStus();

    void deleteStudent(String id);

    int getIndex(String id);

    void reAddStudent(Student stu, String id);
}
