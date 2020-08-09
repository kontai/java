import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class demo1 {
    public static void main(String[] args) throws ParserConfigurationException, SAXException
    {
        SAXParserFactory saxfac=SAXParserFactory.newDefaultInstance();
//        SAXParser parser= SAXParserFactory.newInstance().newSAXParser();
        SAXParser parser=saxfac.newSAXParser();
//        parser.parse(Person.getInpu)
    }
}
