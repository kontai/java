package 常用API.Calendar;

import java.util.Calendar;

/*
 * Calendar：日历，提供了一些操作年月日时的方法
 *
 * 获取
 * 修改
 * 添加
 *
 *
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //static Calendar getInstance()
        Calendar c = Calendar.getInstance();

        //void set(int field, int value) ：把指定的字段修改成指定的值
        //c.set(Calendar.DAY_OF_MONTH, 20);

        //void add(int field, int amount): 在指定的字段上加上指定的值
        c.add(Calendar.DAY_OF_MONTH, -1);

        //int get(int field) // 返回给定日历字段的值
        //public static final int YEAR 1
        //System.out.println(Calendar.YEAR);

        //int year = c.get(1);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);


        System.out.println(year + "年" + month + "月" + day + "日");

    }
}
