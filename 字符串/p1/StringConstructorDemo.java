package p1;

public class StringConstructorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 將字節數組或者字符數組轉成字符串可以通過String類的構造函數完成。
		 */
		
		stringConstructorDemo2();
	}

	private static void stringConstructorDemo2() {
		char[] arr = {'w','a','p','q','x'};
		String s = new String(arr,1,3);
		
		System.out.println("s="+s);
	}

	public static void stringConstructorDemo() {
		String s = new String();//等效於String s = "";  不等效String s = null;
		
		byte[] arr = {97,66,67,68};
		
		String s1 = new String(arr);
		System.out.println("s1="+s1);
		
	}



}
