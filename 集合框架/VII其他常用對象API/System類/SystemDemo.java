package 集合框架.VII其他常用對象API.System類;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		
		
		/*
		 * System:類中的方法和屬性都是靜態的。
		 * 
		 * 
		 * 常見方法：
		 * long currentTimeMillis();獲取當前時間的毫秒值。 
		 * 
		 */
		
//		long l1 = 1335664696656l;//System.currentTimeMillis();
//		System.out.println(l1/1000/60/60/24);//1335664696656
//		code..
//		long l2 = System.currentTimeMillis();
//		System.out.println(l2-l1);

		
		System.out.println("hello-"+LINE_SEPARATOR+" world");
//		demo_1();
		//給系統設置一些屬性信息。這些信息是全局，其他程序都可以使用。 
//		System.setProperty("myclasspath", "c:\myclass");
		
	}
	
	public static void demo_1(){
		//獲取系統的屬性信息，並存儲到了Properties集合中。 
		/*
		 * properties集合中存儲都是String類型的鍵和值。
		 * 最好使用它自己的存儲和取出的方法來完成元素的操作。
		 */
		Properties prop = System.getProperties();
		
		Set<String> nameSet = prop.stringPropertyNames();
		
		for(String name : nameSet){
			String value = prop.getProperty(name);
			
			System.out.println(name+"::"+value);
		}
		
	}
	
}












