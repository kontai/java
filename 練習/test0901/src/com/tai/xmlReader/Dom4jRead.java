package com.tai.xmlReader;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

public class Dom4jRead {
    public static void main(String[] args)
    {
        SAXReader saxReader = new SAXReader();
        Document read = null;
        try
        {
            read = saxReader.read(new FileReader("Demo.xml"));
            Element root = read.getRootElement();
            Iterator<?> it = root.elementIterator();
            while (it.hasNext())
            {
                Element e = (Element) it.next();
                Element name = e.element("name");
                Attribute id = name.attribute("id");
                Element age = e.element("age");
                System.out.println(id.getName() + "=" + id.getValue());
                System.out.println("name:" + name.getText() + " age:" + age.getText());
                System.out.println("--------------------------------------");
            }
        } catch (DocumentException | FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
