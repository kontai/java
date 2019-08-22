package 練習.練習四.L9;
import sun.java2d.loops.GeneralRenderer;
import sun.util.calendar.Gregorian;

import java.util.GregorianCalendar;

public class usingGrCal {
    public static void main(String[] args) {
        GregorianCalendar date1=new GregorianCalendar();
        date1.setTimeInMillis(1234567898765L);
        System.out.println(date1.getTime());
    }

    public static GeneralRenderer get(GeneralRenderer d01)
    {
        return d01;
    }
}

