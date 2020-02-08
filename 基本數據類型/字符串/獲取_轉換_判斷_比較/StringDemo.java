package 基本數據類型.字符串.獲取_轉換_判斷_比較;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String類的特點：
		 * 字符串對像一旦被初始化就不會被改變。
		 * 
		 */
		stringDemo2();
	}

	public static void stringDemo2() {
		// TODO Auto-generated method stub
		
		String s = "abc";//創建一個字符串對像在常量池中。		
		String s1 = new String("abc");//創建兩個對像一個new一個字符串對像在堆內存中。
		
		System.out.println(s==s1);//false
		
		System.out.println(s.equals(s1));
		//string類中的equals複寫Object中的equals建立了string類自己的判斷字符串對象是否相同的依據。
		//其實就是比較字符串內容。
		
		
//		System.out.println("s="+s);
//		System.out.println("s1="+s1);
		
	}

	/**
	 * 演示字符串定義的第一種方式，並明確字符串常量池的特點.
	 * 池中沒有就建立，池中有，直接用。
	 */
	private static void stringDemo1() {
		String s = "abc";//"abc"存儲在字符串常量池中。
//		s = "nba";
		String s1 = "abc";		
		System.out.println(s==s1);//true?
//		System.out.println("s="+s);
	}

}
