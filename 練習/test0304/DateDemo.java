package test0304;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */

public class DateDemo {
    public static void main(String[] args) throws InterruptedException, IOException
    {
        showTime();
    }

    public static void showTime() throws InterruptedException, IOException
    {
        long time = System.currentTimeMillis();
//        System.out.println(System.currentTimeMillis());
//        Thread.sleep(100);


        Date date = new Date();
        Date date2=new Date(Long.valueOf("1583290112844"));

/*
        System.out.println(date);
        System.out.println(date2);
        System.out.println(date.getTime());;
        System.out.println(date2.getTime());;
*/

//        DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.LONG);
//        dateFormat=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
//        DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy ww");
//        String str_date=dateFormat.format(date);
//        System.out.println(str_date);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(dateFormat.format(date));
        dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        System.out.println(dateFormat.format(date));
        dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
        System.out.println(dateFormat.format(date));

    }

}
