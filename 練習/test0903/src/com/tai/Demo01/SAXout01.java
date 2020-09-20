package com.tai.Demo01;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class SAXout01 {
    public static void main(String[] args)
    {
        Document doc = DocumentHelper.createDocument();

        Element root = doc.addElement("BODY");
        Element person = root.addElement("Person");
        person.addAttribute("id", "1");

        Element name = person.addElement("name");
        Element age = person.addElement("age");
        Element gender = person.addElement("gender");

        name.addText("kontai");
        age.addText("18");
        gender.addText("male");

        Writer writer=null;
        try
        {
            File file;
             writer=new FileWriter(new File("newXML.xml"));;
             OutputFormat format=OutputFormat.createPrettyPrint();
             format.

//            doc.write(writer);
        } catch (IOException e)
        {
            e.printStackTrace();
        }finally
        {
            if(writer!=null)
            {
                try
                {
                    writer.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }


//        OutputFormat format=OutputFormat.createPrettyPrint();





    }
}
