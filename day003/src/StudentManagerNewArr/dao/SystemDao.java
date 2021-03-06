package StudentManagerNewArr.dao;

import StudentManagerNewArr.domain.Student;

import java.util.ArrayList;

public class SystemDao implements BaseDao {
    private static ArrayList<Student> stus = new ArrayList<>();

    static {
        Student stu1 = new Student("suren001", "田所浩一", "24", "1999-1-1");
        Student stu2 = new Student("suren002", "田所浩二", "25", "1998-1-1");
        Student stu3 = new Student("suren003", "田所浩三", "26", "1997-1-1");
        Student stu4 = new Student("suren004", "田所浩四", "27", "1996-1-1");
        Student stu5 = new Student("suren005", "田所浩五", "28", "1995-1-1");
        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);
        stus.add(stu4);
        stus.add(stu5);
    }

    public void addStudent(Student stu) {
        stus.add(stu);
    }

    public ArrayList<Student> getStus() {
        return stus;
    }

    public void deleteStudent(String id) {
        int index = getIndex(id);
        stus.remove(index);
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            if (stus.get(i) != null && stus.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void reAddStudent(Student stu, String id) {
        int index = getIndex(id);
        stus.set(index, stu);
    }
}