package 抽象類.Calendar;


import java.util.*;

public class TestCalendar {
    public static void main(String[] args) {
        // Construct a Gregorian calendar for the current date and time
        Calendar calendar = new GregorianCalendar();
        showCalendar(calendar);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        showCalendar(calendar);

        // Construct a calendar for December 25, 1997
        Calendar calendar1 = new GregorianCalendar(1980, 9, 1);
        String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        System.out.println("September 1, 1980 is a " +
                dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);
    }

    public static void showCalendar(Calendar calendar) {
        System.out.println("************************");
        System.out.println("Current time is " + new Date());
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("DATE: " + calendar.get(Calendar.DATE));
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " +
                calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("DAY_OF_WEEK: " +
                calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_MONTH: " +
                calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: " +
                calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("WEEK_OF_MONTH: " +
                calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR: " +
                calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
        System.out.println("************************");
    }
}

