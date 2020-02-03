package p1;

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
