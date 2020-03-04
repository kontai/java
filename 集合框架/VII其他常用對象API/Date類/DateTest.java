package 集合框架.VII其他常用對象API.Date類;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/* 練習：
 * "2012-3-17"到"2012-4-6"
 * 中間有多少天？
 * 思路：
 * 兩個日期相減就哦了。
 * 咋減呢？
 * 必須要有兩個可以進行減法運算的數。
 * 能減可以是毫秒值。如何獲取毫秒值？通過date對象。
 * 如何獲取date對象呢？可以將字符串轉成date對象。
 * 
 * 1,將日期格式的字符串轉成Date對象。
 * 2,將Date對像轉成毫秒值。
 * 3，相減，在變成天數 
 * 
 * 
 */

public class DateTest {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {

		String str_date1 = "2012-3-17";
		String str_date2 = "2012-4-18";
		test(str_date1,str_date2);
	}

	public static void test(String str_date1,String str_date2) throws ParseException {
		
		//1,將日期字符串轉成日期對象。
		//定義日期格式對象。
		DateFormat dateFormat = DateFormat.getDateInstance();
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date1 = dateFormat.parse(str_date1);
		Date date2 = dateFormat.parse(str_date2);
		
		long time1 = date1.getTime();
		long time2 = date2.getTime();
		
		long time = Math.abs(time1-time2);
		
		
		int day = getDay(time);
		System.out.println(day);
		
	}

	private static int getDay(long time) {
		
		int day = (int)(time/1000/60/60/24);
		
		return day;
	}
	
	
	
	

}
