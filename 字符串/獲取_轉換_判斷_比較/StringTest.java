package 獲取_轉換_判斷_比較;



/*
 * 1，給定一個字符串數組。按照字典順序進行從小到大的排序。
 * {"nba","abc","cba","zz","qq","haha"}
 * 
 * 
 * 2，一個子串在整串中出現的次數。
 * "nbaernbatynbauinbaopnba"
 * 
 * 
 * 
 * 3，兩個字符串中最大相同的子串。
 * 
 * 
 * 
 * 4，模擬一個trim功能一致的方法。
 * 
 * 
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "java";
		
		show(s1,s2);
		
		System.out.println(s1+"...."+s2);// hello java
	}
	
	public static void show(String s1,String s2){
		
		s2.replace('a','o');
		s1 = s2;
	}
	

}
