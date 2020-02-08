package 基本數據類型.字符串.獲取_轉換_判斷_比較;

public class StringObjectDemo {


	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		String s1 = "abc";
//		String s2 = "abc";
		
		//intern():對字符串池進行操作的 
		
		String s1 = new String("abc");
		String s2 = s1.intern();
		
		System.out.println(s1==s2);
		
		
		
	}

}
