package 集合框架.VII其他常用對象API.Date類;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {

		methodDemo_3();

		
	}
	

	/**
	 * 將日期格式的字符串-->日期對象。
	 * 	使用的是DateFormat類中的parse()方法。 
	 * 
	 * @throws ParseException 
	 */
	public  static void methodDemo_3() throws ParseException {
		
		String str_date = "2012年4月19日";
		str_date = "2011---8---17";
		
				
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		
		dateFormat = new SimpleDateFormat("yyyy---MM---dd");
		
		
		Date date = dateFormat.parse(str_date);
		
		System.out.println(date);
		
		
	}


	/**
	 * 對日期對像進行格式化。
	 * 將日期對像-->日期格式的字符串。
	 * 	使用的是DateFormat類中的format方法。
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void methodDemo_2() {
		
		Date date = new Date();
		
		//獲取日期格式對象。具體著默認的風格。 FULL LONG等可以指定風格。
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
//		System.out.println(dateFormat);
		
		//如果風格是自定義的如何解決呢？
		dateFormat = new SimpleDateFormat("yyyy--MM--dd");
		
		String str_date = dateFormat.format(date);
		
		System.out.println(str_date);
	}
	
	
	
	/**
	 * 日期對像和毫秒值之間的轉換。
	 * 
	 * 毫秒值-->日期對像 ： 
	 * 	1，通過Date對象的構造方法  new Date(timeMillis);
	 *  2，還可以通過setTime設置。 
	 *  因為可以通過Date對象的方法對該日期中的各個字段(年月日等)進行操作。
	 *  
	 * 
	 * 日期對像-->毫秒值：
	 * 	2，getTime方法。
	 * 因為可以通過具體的數值進行運算。 
	 * 
	 * 
	 */
	public static void methodDemo_1() {
		long time = System.currentTimeMillis();//
//		System.out.println(time);//1335671230671
		
		Date date = new Date();//將當前日期和時間封裝成Date對象。
		System.out.println(date);//Sun Apr 29 11:48:02 CST 2012
		
		Date date2 = new Date(1335664696656l);//將指定毫秒值封裝成Date對象。
		System.out.println(date2);
	}
	
	

}
