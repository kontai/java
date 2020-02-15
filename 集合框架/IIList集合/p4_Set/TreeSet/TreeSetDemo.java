package 集合框架.IIList集合.p4_Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		TreeSet ts = new TreeSet(new ComparatorByName());
		TreeSet ts = new TreeSet();
		/*
		 * 以Person對像年齡進行從小到大的排序。
		 * 
		 */
		
		ts.add(new Person("zhangsan",28));
		ts.add(new Person("lisi",21));
		ts.add(new Person("zhouqi",29));
		ts.add(new Person("zhaoliu",25));
		ts.add(new Person("wangu",29));
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()){
			Person p = (Person)it.next();
			
			System.out.println(p.getName()+":"+p.getAge());
		}
	
	}



	/**
	 * 
	 */
	public static void demo1() {
		TreeSet ts = new TreeSet();
		
		ts.add("abc");
		ts.add("zaa");
		ts.add("aa");
		ts.add("nba");
		ts.add("cba");
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
