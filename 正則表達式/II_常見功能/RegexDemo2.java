package 正則表達式.II_常見功能;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * 正則表達式對字符串的常見操作:
		 * 1, 匹配。
		 * 		其實使用的就是String類中的matches方法。
		 * 
		 * 2，切割。
		 * 		其實使用的就是String類中的split方法。 
		 * 
		 * 3，替換。
		 * 		其實使用的就是String類中的replaceAll()方法。
		 * 
		 * 4，獲取。
		 * 		
		 */

//		functionDemo_1();
//		functionDemo_2();
//		functionDemo_3();
		functionDemo_4();
	}
	
	/*
	 * 獲取 
	 * 將正則規則進行對象的封裝。 
	 * Pattern p = Pattern.compile("a*b");
	 *  //通過正則對象的matcher方法字符串相關聯。獲取要對字符串操作的匹配器對像Matcher .
 	 * Matcher m = p.matcher("aaaaab");
 	 * //通過Matcher匹配器對象的方法對字符串進行操作。
 	 * boolean b = m.matches();
	 * 
	 * 
	 */
	public  static void functionDemo_4() {
		
		String str = "da jia hao,ming tian bu fang jia!";
		
		String regex = "\\b[a-z]{3}\\b";
		
		//1,將正則封裝成對象。
		Pattern p = Pattern.compile(regex);
		//2, 通過正則對像獲取匹配器對象。 
		Matcher m = p.matcher(str);
		
		//使用Matcher對象的方法對字符串進行操作。
		//既然要獲取三個字母組成的單詞 
		//查找。 find();
		System.out.println(str);
		while(m.find()){
			System.out.println(m.group());//獲取匹配的子序列
			
			System.out.println(m.start()+":"+m.end());
		}
	}

	/*
	 * 替換 
	 */
	public static void functionDemo_3() {
		
		String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";
		
		str = str.replaceAll("(.)\\1+", "$1");
		
		System.out.println(str);
		
		String tel = "15800001111";//158****1111;
		
		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
		
		System.out.println(tel);
		
	}

	/*
	 * 切割。
	 * 
	 * 組：((A)(B(C))) 
	 */
	public static void functionDemo_2(){

		String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";
		
		String[] names = str.split("(.)\\1+");//str.split("\\.");
		
		for(String name : names){
			System.out.println(name);
		}
		
	}
	/*
	 * 演示匹配。 
	 */
	public static void functionDemo_1(){
	
		
		//匹配手機號碼是否正確。 
		String tel = "15800001111";
		
		String regex = "1[358]\\d{9}";   
		
		boolean b = tel.matches(regex);
		System.out.println(tel+":"+b);
	}
	

}
