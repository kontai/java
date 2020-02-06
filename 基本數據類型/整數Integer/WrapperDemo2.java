package 基本數據類型.整數Integer;

public class WrapperDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 4;
		num = num + 5;
		
		Integer i =  4;//i = new Integer(4);自動裝箱  簡化書寫。
		i = i + 6;// i = new Integer(i.intValue() + 6); //i.intValue() 自動拆箱
		
		
//		show(55);//
		
		
		Integer a = new Integer(128);
		Integer b = new Integer(128);
		
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		
		Integer x = 129;//jdk1.5以後，自動裝箱，如果裝箱的是一個字節，那麼該數據會被共享不會重新開闢空間。
		Integer y = 129;
		System.out.println(x==y);//
		System.out.println(x.equals(y));//true
		
		
	}
	
	public static void show(Object a){//Object a = new Integer(55);
		System.out.println("a="+a);
	}

}
