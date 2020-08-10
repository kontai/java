import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XmlDemo02 {
    public static void main(String[] args)
    {
        try
        {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            ;
            SAXParser parser = factory.newSAXParser();
            Phandler phandler = new Phandler();
            parser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("p.xml"), phandler);
            List<Person> p = phandler.getPersons();
            for (Person t : p)
            {
                System.out.println(t.getName() + "..." + t.getAge());
            }
        } catch (ParserConfigurationException | SAXException | IOException e)
        {
            e.printStackTrace();
        }
    }

}

class Phandler extends DefaultHandler {
    private List<Person> persons;
    private Person person;
    private String tag;


    @Override
    public void startDocument()
    {
        persons = new ArrayList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
    {
        tag = qName;
        if (tag != null)
        {
            if (tag.equals("person"))
            {
                person = new Person();
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName)
    {
        System.out.println(qName);
        if (qName != null)
        {
            if (qName.equals("person"))
            { persons.add(person); }
        }
        tag = null;
        ;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException
    {
        String na = new String(ch, start, length).trim();
        if (tag != null)
        {
            if (tag.equals("name"))
            {
                if (tag.length() > 0)
                { person.setName(na); }
            }
            else if (tag.equals("age"))
            {
                if (na.length() > 0)
                { person.setAge(Integer.parseInt(na)); }
            }
        }
    }

    public List<Person> getPersons()
    {
        return persons;
    }
}


