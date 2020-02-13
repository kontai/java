package 集合框架.IIList集合.p4_Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;



/*
 * 往hashSet集合中存儲Person對象。如果姓名和年齡相同，視為同一個人。視為相同元素。
 */
public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		HashSet hs = new HashSet();
		
		/*
		 * HashSet集合數據結構是哈希表，所以存儲元素的時候，
		 * 使用的元素的hashCode方法來確定位置，如果位置相同，在通過元素的equals來確定是否相同。
		 * 
		 */
		
		hs.add(new Person("lisi4",24));
		hs.add(new Person("lisi7",27));
		hs.add(new Person("lisi1",21));
		hs.add(new Person("lisi9",29));
		hs.add(new Person("lisi7",27));
		
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			Person p = (Person)it.next();
//			System.out.println(p);
			System.out.println(p.getName()+"...."+p.getAge());
		}
	}

}
