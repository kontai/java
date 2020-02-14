package 集合框架.IIList集合.p4_Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet hs = new LinkedHashSet();
		
		hs.add("hahah");
		hs.add("hehe");
		hs.add("xixii");
		hs.add("heihei");
//		hs.add("hehe");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());	//有序
		}
	}

}
