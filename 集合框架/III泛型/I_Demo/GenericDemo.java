package 集合框架.III泛型.I_Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int[] arr = new int[4];
//		arr[0] = 3.0;


		ArrayList<String> al = new ArrayList<String>();	//容器內只允許存儲String
		
		al.add("abc");//public boolean add(Object obj)
		al.add("hahah");
//		al.add(4);//al.add(new Integer(4));
		
		Iterator<String> it = al.iterator();	//使用Interator迭代String對象 (不需要再強轉)
		while(it.hasNext()){
			
			String str = it.next();
			System.out.println(str);
		}
	}

}



