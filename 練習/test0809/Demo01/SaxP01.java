import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class SaxP01 {
    public static void main(String[] args) throws ParserConfigurationException, SAXException
    {
        //create SaxParserFactory創建解析工廠
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        DemoHandler hanler = new DemoHandler();
        try
        {
            parser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("web.xml"), hanler);
        } catch (IOException e)
        {
            System.out.println("檔案解析失敗");
            e.printStackTrace();
        }
    }
}


class DemoHandler extends DefaultHandler  {
    static int ident = 0;

    public DemoHandler()
    {

    }

    @Override
    public void startDocument() throws SAXException
    {
        System.out.println("calling startDocument~");
    }

    @Override
    public void declaration(String version, String encoding, String standalone) throws SAXException
    {
    }

    @Override
    public void endDocument() throws SAXException
    {
        System.out.println("calling endtDocument~");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
    {
        //        System.out.println("uti="+uri);
        //        System.out.println("localName="+localName);
        ident++;
        for (int i = 0; i < ident; i++)
            System.out.print("  ");
        System.out.println(qName);
        //        System.out.printf("attributes="+attributes);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException
    {
        ident--;
        for (int i = 0; i < ident; i++)
            System.out.printf("  ");
        System.out.println("(In endElement)" + qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException
    {
        String str = new String(ch, start, length).trim();
        if (str.length() > 0)

        {
            ident++;
            for (int i = 0; i < ident; i++)
                System.out.printf("  ");
            System.out.println(str);
            ident--;
        }
    }


}
