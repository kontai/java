package p1;

public class StringMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		/*
		 * 按照面向對象的思想對字符串進行功能分類。
		 * "abcd"
		 * 
		 * 1,獲取：
		 * 1.1 獲取字符串中字符的個數(長度).
		 * 		int length();
		 * 1.2 根據位置獲取字符。
		 * 		char charAt(int index);
		 * 1.3 根據字符獲取在字符串中的第一次出現的位置.
		 * 		int indexOf(int ch)
		 * 		int indexOf(int ch,int fromIndex):從指定位置進行ch的查找第一次出現位置 
		 * 		int indexOf(String str);
		 * 		int indexOf(String str,int fromIndex);
		 * 		 根據字符串獲取在字符串中的第一次出現的位置.
		 * 		int lastIndexOf(int ch)
		 * 		int lastIndexOf(int ch,int fromIndex):從指定位置進行ch的查找第一次出現位置 
		 * 		int lastIndexOf(String str);
		 * 		int lastIndexOf(String str,int fromIndex);
		 * 1.4 獲取字符串中一部分字符串。也叫子串.
		 * 		String substring(int beginIndex, int endIndex)//包含begin 不包含end 。
		 * 		String substring(int beginIndex);
		 * 		
		 * 
		 * 
		 * 2，轉換。
		 * 		2.1 將字符串變成字符串數組(字符串的切割)
		 * 			String[]  split(String regex):涉及到正則表達式.
		 * 		2.2 將字符串變成字符數組。
		 * 			char[] toCharArray();
		 * 		2.3 將字符串變成字節數組。
		 * 			byte[] getBytes();
		 * 		2.4 將字符串中的字母轉成大小寫。
		 * 			String toUpperCase():大寫
		 * 			String toLowerCase():小寫
		 *		2.5  將字符串中的內容進行替換
		 *			String replace(char oldch,char newch);
		 * 			String replace(String s1,String s2);
		 * 		2.6 將字符串兩端的空格去除。
		 * 			String trim();
		 * 		2.7 將字符串進行連接 。
		 * 			String concat(string);
		 * 
		 * 3，判斷
		 * 		3.1 兩個字符串內容是否相同啊？
		 * 			boolean equals(Object obj);
		 * 			boolean equalsIgnoreCase(string str);忽略大寫比較字符串內容。
		 * 		3.2 字符串中是否包含指定字符串？
		 * 			boolean contains(string str);
		 * 		3.3 字符串是否以指定字符串開頭。是否以指定字符串結尾。
		 * 			boolean startsWith(string);
		 * 			boolean endsWith(string);
		 * 		
		 * 4，比較。
		 * 		
		 */
		stringMethodDemo_4();
		
//		System.out.println("abc".concat("kk"));
//		System.out.println("abc"+"kk");
		
//		System.out.println(String.valueOf(4)+1);
//		System.out.println(""+4+1);
		
	}

	private static void stringMethodDemo_4() {
		
		System.out.println("abc".compareTo("aqz"));
	}

	private static void stringMethodDemo_3() {
		String s = "abc";
		System.out.println(s.equals("ABC".toLowerCase()));
		System.out.println(s.equalsIgnoreCase("ABC"));
		
		System.out.println(s.contains("cc"));
		
		String str  = "ArrayDemo.java";
		
		System.out.println(str.startsWith("Array"));
		System.out.println(str.endsWith(".java"));
		System.out.println(str.contains("Demo"));
	}

	private static void stringMethodDemo_2() {
		
		String  s = "張三,李四,王五";
		String[] arr = s.split(",");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		char[] chs = s.toCharArray();
		
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		s = "ab你";
		byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		
		System.out.println("Abc".toUpperCase());
		
		
		String s1 = "java";
		String s2 = s1.replace('q', 'z');
		System.out.println(s1==s2);//true
		
		System.out.println("-"+"    ab  c    ".trim()+"-");
		
	}

	private static void stringMethodDemo_1() {
		
		String  s = "abcdae";
		
		System.out.println("length:"+s.length());//6
		System.out.println("char:"+s.charAt(2));//c//StringIndexOutOfBoundsException
		System.out.println("index:"+s.indexOf('k'));//0//-1 我們可以根據-1，來判斷該字符或者字符串是否存在。
		System.out.println("lastIndex:"+s.lastIndexOf('a'));//4
		
		
		System.out.println("substring:"+s.substring(2,4));
	}

}
