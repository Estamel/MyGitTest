package test05;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DocumentException {
        SAXReader sr = new SAXReader();
        Document read = sr.read(new File("day018\\src\\test05\\test.xml"));
        Element rootElement = read.getRootElement();
        List<Element> student = rootElement.elements("student");
        ArrayList<Student> arr = new ArrayList<>();
        for (Element element : student) {
            Attribute attribute = element.attribute("id");
            String value = attribute.getValue();
            Element name = element.element("name");
            String stringValue = name.getText();
            Element age = element.element("age");
            String stringValue1 = age.getText();
            Student stu = new Student(value, stringValue, stringValue1);
            arr.add(stu);
        }
        for (Student student1 : arr) {
            System.out.println(student1);
        }
        List<Element> teacher = rootElement.elements("teacher");
        ArrayList<Teacher> arr1 = new ArrayList<>();
        for (Element element : teacher) {
            Attribute attribute = element.attribute("id");
            String value = attribute.getValue();
            Element name = element.element("name");
            String stringValue = name.getText();
            Element age = element.element("age");
            String stringValue1 = age.getText();
            Teacher tea = new Teacher(value, stringValue, stringValue1);
            arr1.add(tea);
        }
        for (Teacher teacher1 : arr1) {
            System.out.println(teacher1);
        }
    }
}
