package 集合框架.IVMap集合.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Map在有映射關係時，可以優先考慮。
		 * 
		 * 在查表法中的應用較為多見。
		 */
		
		String week = getWeek(1);
		System.out.println(week);
		
		System.out.println(getWeekByMap(week));
	}
	public static String getWeekByMap(String week){
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("星期一","Mon");
		map.put("星期二","Tus");
		map.put("星期三","Wes");
		map.put("星期日","Sun");
		map.put("星期天","Sun");
		
		return map.get(week);
	}
	
	
	public static String getWeek(int week){
		
		if(week<1 || week>7)
			throw new RuntimeException("沒有對應的星期，請您重新輸入");
		
		String[] weeks = {"","星期一","星期二"};
		
		return weeks[week];
	}

}
