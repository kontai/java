package 集合框架.IIList集合.p4_Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet hs = new HashSet();
		
		hs.add("hehe");
//		hs.add("heihei");
		hs.add("hahah");
		hs.add("xixii");
		hs.add("hehe");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
