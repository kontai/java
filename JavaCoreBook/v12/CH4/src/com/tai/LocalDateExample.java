package com.tai;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);    //current date

        LocalDate newYearEve=LocalDate.of(1999,12,31);
        int year=newYearEve.getYear();
        int month=newYearEve.getMonthValue();
        int day=newYearEve.getDayOfMonth();

        System.out.println();
        System.out.println("Year="+year);
        System.out.println("Month="+month);
        System.out.println("Day="+day);

        /////////////////////////////////////////////
        GregorianCalendar somDay=new GregorianCalendar(1999,11,31);
        //add feature tof that class month numbers go from 0 to 11
        somDay.add(Calendar.DAY_OF_MONTH,1000);
        year=somDay.get(Calendar.YEAR);
        month=somDay.get(Calendar.MONTH);
        day=somDay.get(Calendar.DAY_OF_MONTH);
        System.out.println();
        System.out.println("Year="+year);
        System.out.println("Month="+month);
        System.out.println("Day="+day);

    }
}
