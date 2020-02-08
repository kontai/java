package 基本數據類型.整數Integer;

public class WrapperDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * 基本數據類型對像包裝類。
		 * 為了方便操作基本數據類型值，將其封裝成了對象，在對像中定義了屬性和行為豐富了該數據的操作。
		 * 用於描述該對象的類就稱為基本數據類型對像包裝類。
		 * 
		 * byte		Byte
		 * short	Short
		 * int		Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * char		Character
		 * boolean	Boolean
		 * 
		 * 該包裝對像主要用基本類型和字符串之間的轉換。
		 * 
		 * 基本類型--->字符串
		 * 		1,基本類型數值+""
		 * 		2,用String類中的靜態方法valueOf(基本類型數值);
		 * 		3,用Integer的靜態方法valueO(基本類型數值);
		 * 
		 * 字符串--->基本類型
		 * 		1,使用包裝類中的靜態方法   xxx parseXxx("xxx類型的字符串");*****
		 * 			int parseInt("intstring");
		 * 			long parseLong("longstring");
		 * 			boolean parseBoolean("booleanstring");
		 * 			只有Character沒有parse方法 
		 * 		2,如果字符串被Integer進行對象的封裝。
		 * 			可使用另一個非靜態的方法，intValue();
		 * 			將一個Integer對像轉成基本數據類型值。
		 * 
		 * 
		 */
		
		
//		System.out.println(Integer.MAX_VALUE);
		
//		System.out.println(Integer.toBinaryString(-6));
		
//		int num = 4;
//		Integer i = new Integer(5);
		
//		int x = Integer.parseInt("123");
//		System.out.println(Integer.parseInt("123")+1);
		
//		Integer i = new Integer("123");		
//		System.out.println(i.intValue());
		
		
		/*
		 * 整數具備不同的進制體現。
		 * 
		 * 十進制-->其他進制。
		 * 		toBinaryString
		 * 		toOctalString
		 * 		toHexString
		 * 
		 * 其他進制-->十進制。
		 * 		parseInt("string",radix)
		 * 
		 */
		
//		十進制-->其他進制。
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		
		
//		System.out.println(Integer.toString(60,16));
//		其他進制-->十進制。
//		System.out.println(Integer.parseInt("3c",16));
		
		
		Integer a = new Integer("89");
//		如果不需要新的 Integer 实例，则通常应优先使用该方法，而不是构造方法 Integer(int)，因为该方法有可能通过缓存经常请求的值而显著提高空间和时间性能。
		Integer b = new Integer(300);
		
		System.out.println(a==b);
		
		System.out.println(a.equals(b));
		
//		System.out.println(3>3);
		System.out.println(a.compareTo(b));
		
		
		
	}

}











