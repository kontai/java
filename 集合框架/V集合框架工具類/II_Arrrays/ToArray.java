package 集合框架.V集合框架工具類.II_Arrrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ToArray {
	public static void main(String[] args) {
		
		
		/*
		 * 集合轉成數組呢？
		 * 
		 * 使用的就是Collection接口中的toArray方法。
		 * 
		 * 集合轉成數組：可以對集合中的元素操作的方法進行限定。不允許對其進行增刪。
		 * 
		 * 
		 */
		
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		
		/*
		 * toArray方法需要傳入一個指定類型的數組。
		 * 長度該如何定義呢？
		 * 如果長度小於集合的size，那麼該方法會創建一個同類型並和集合相同size的數組。
		 * 如果長度大於集合的size，那麼該方法就會使用指定的數組，存儲集合中的元素，其他位置默認為null。
		 * 
		 * 所以建議，最後長度就指定為，集合的size。
		 */
		String[] arr = list.toArray(new String[list.size()]);
		
		System.out.println(Arrays.toString(arr));

	}
}
