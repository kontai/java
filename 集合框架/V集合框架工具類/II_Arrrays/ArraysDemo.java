package 集合框架.V集合框架工具類.II_Arrrays;

import java.util.Arrays;
import java.util.List;


//數組轉成集合。
public class ArraysDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Arrays：集合框架的工具類。裡面的方法都是靜態的。
		 * 
		 */
		
//		int[] arr = {3,1,5,6,3,6};		
//		System.out.println(Arrays.toString(arr));
		
		demo_2();
	}

	public static void demo_2() {
		
		/*
		 * 如果數組中的元素是對象，那麼轉成集合時，直接將數組中的元素作為集合中的元素進行集合存儲。
		 * 
		 * 如果數組中的元素是基本類型數值，那麼會將該數組作為集合中的元素進行存儲。
		 * 
		 */
		int[] arr = {31,11,51,61};
		
		List<int[]> list = Arrays.asList(arr);
		
		System.out.println(list);
	}

	/**
	 * 
	 */
	public static void demo_1() {
		/*
		 * 重點：List asList(數組)將數組轉成集合。
		 * 
		 * 好處：其實可以使用集合的方法操作數組中的元素。
		 * 注意：數組的長度是固定的，所以對於集合的增刪方法是不可以使用的
		 * 否則會發生UnsupportedOperationException
		 * 
		 * 
		 */
		String[] arr = {"abc","haha","xixi"};
		
		boolean b = myContains(arr, "xixi");
		System.out.println("contains:"+b);
		
		List<String> list = Arrays.asList(arr);
		boolean b1 = list.contains("xixi");
		System.out.println("list contaisn:="+b1);
//		list.add("hiahia");//UnsupportedOperationException
		
		System.out.println(list);
	}
	
	public static boolean myContains(String[] arr,String key){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(key))
				return true;
		}
		return false;
	}
	
	//toString的經典實現。
	public static String myToString(int[] a){
		int iMax = a.length - 1;
		if (iMax == -1)
	            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0;  ; i++) {//中間省略條件判斷，提高了效率。
            b.append(a[i]);
	    if (i == iMax)
	    	return b.append(']').toString();
           b.append(", ");
        }
	}

}
