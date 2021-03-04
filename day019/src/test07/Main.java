package test07;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DocumentException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class student = Class.forName("test07.Student");
        Constructor constructor = student.getDeclaredConstructor(String.class, String.class, String.class);
        constructor.setAccessible(true);
        ArrayList<Student> arr = new ArrayList<>();
        SAXReader sa = new SAXReader();
        Document read = sa.read(new File("day019\\src\\test07\\XmlTest.xml"));
        Element rootElement = read.getRootElement();
        List<Element> students = rootElement.elements("student");
        for (Element element : students) {
            Attribute name = element.attribute("id");
            String name1 = element.elementText("name");
            String age = element.elementText("age");
            String job = element.elementText("job");
            Student o = (Student) constructor.newInstance(name1, age, job);
            arr.add(o);
        }
        for (Student student1 : arr) {
            System.out.println(student1);
        }
    }
}
