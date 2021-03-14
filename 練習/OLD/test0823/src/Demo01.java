import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.sql.ResultSet;
import java.util.logging.Handler;

public class Demo01 {
    public static void main(String[] args)
    {

        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser parser = null;
        try
        {
            parser = spf.newSAXParser();
            MyHandler handler=new MyHandler();
            parser.getXMLReader().setContentHandler(handler);
//            parser.parse();
        } catch (ParserConfigurationException | SAXException e)
        {
            e.printStackTrace();
        }
        System.out.println("");
    }

    private static class MyHandler extends DefaultHandler {
        @Override
        public void startDocument() throws SAXException
        {
            System.out.println("啟動!!");
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
        {
            super.startElement(uri, localName, qName, attributes);
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException
        {
            super.endElement(uri, localName, qName);
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException
        {
            super.characters(ch, start, length);
        }
    }
}
