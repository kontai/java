package 集合框架.IIList集合.p2_LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		LinkedList link = new LinkedList();

		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		System.out.println(link);
//		System.out.println(link.getFirst());//獲取第一個但不刪除。
//		System.out.println(link.getFirst());
		
//		System.out.println(link.removeFirst());//獲取元素但是會刪除。
//		System.out.println(link.removeFirst());
		
		while(!link.isEmpty()){
			System.out.println(link.removeLast());
		}
		
		
		System.out.println(link);
//		Iterator it = link.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
	}

}





