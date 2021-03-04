package test06;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DocumentException {
        SAXReader sa = new SAXReader();
        Document read = sa.read(new File("day020\\src\\test06\\TestXml.xml"));
        Element rootElement = read.getRootElement();
        List<Element> student = rootElement.elements("student");
        for (Element element : student) {
            Attribute id = element.attribute("id");
            System.out.println(id.getValue());
            Element name = element.element("name");
            System.out.println(name.getText());
        }
    }
}
