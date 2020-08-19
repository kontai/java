package test0316_Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException
    {
        Demo1();
    }

    private static void Demo1() throws ParseException
    {
        Date date=new Date();
        System.out.println(date);   //Mon Mar 16 10:13:39 CST 2020

        DateFormat dateFormat=DateFormat.getDateTimeInstance();
        String dateformatStr=dateFormat.format(date);
        System.out.println(dateformatStr);  //2020年3月16日 上午10:20:25

        Date pdate=dateFormat.parse(dateformatStr);
        System.out.println(pdate);  //Mon Mar 16 10:20:25 CST 2020

        //將date轉換指定格式輸出
        SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss [第w周]");
        String dateformmatSimple=sd.format(date);
        System.out.println(dateformmatSimple);  //20/27/16

        Date dd=sd.parse(dateformmatSimple);
        System.out.println(dateFormat.format(dd));
        System.out.println(dd);
        System.out.println(dd.getTime());







    }
}
